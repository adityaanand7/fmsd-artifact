#!/bin/bash
#Script for complete artifact
tstamp() { date +[%T]; }
# Path for the code
projectpath=`realpath ..`

# Installed path of Java 8 JDK
java_install_path=`realpath jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

# Path for Analyzing Code
#class_path="${projectpath}/fmsd-artifact/benchmarks/jgf/Moldyn/"
#class_path="${projectpath}/fmsd-artifact/benchmarks/tests/mytest/"

#Class Name
#class_name="JGFMolDynBenchSizeA"
#class_name="Main"


echo "*************** Starting the Staged Analysis Evaluation **************"
echo "Selected Program for Testing is : " $1
cd StagedAnalysis/1.ApplicationEvaluation
echo
echo "---------- PHASE 1: Starting with Application Evaluation (ONLY FOR STATIC PROGRAM ELEMENTS)  ----------"
echo
echo  "Step 1 : Generating the Dependencies using Stava"
cd 0.Stava/scripts
bash benchmark.sh $1
cp CVOUT.txt ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/0.Stava/output
echo " Program elements (#PE): "  $(wc -l < CVOUT.txt)
echo "$(tstamp)  Dependencies generated for the static program elements of program "\"$1\"" in StagedAnalysis/1.ApplicationEvaluation/0.Stava/output/CVOUT.txt"
echo "$(tstamp) Step 1: .......... Completed"
echo
cp CVOUT.txt ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/1.PrePass/CVOUT.txt
echo "Step 2: PrePass (Division of Dependencies as Static, Dynamic and Runtime)"
cd ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/1.PrePass
echo -ne "$(tstamp) compiling...\033[0K\r"
$java_compiler Main.java 2>/dev/null
echo -e "$(tstamp) compiled prepass files!\033[0K\r"
$java_vm Main < CVOUT.txt > out.txt
echo "$(tstamp) Division Generated in StagedAnalysis/1.ApplicationEvaluation/1.PrePass/out.txt"
echo "$(tstamp) Step 2: ............Completed"
echo
cp out.txt ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/prepass.txt
echo "Step 3: (Evaluation) Generating Partial Result "
cd ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator
bash script-amp1.sh
echo "$(tstamp) Partial Result Generated in StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/PartialRes.txt"
echo "Step3 : ............Completed"
echo "**********************************************************************"
echo
echo
echo "---------- PHASE 2: Starting with Library Evaluation  (ONLY DYNAMIC PROGRAM ELEMENTS)  ----------"
echo
echo "Step 1: Generating the Dependencies using stava"
cd ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/1.PrePass/
sort -u AllDynamicList.txt > DynamicList.txt
cp DynamicList.txt ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/0.Stava/
cd ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/0.Stava/
rm -r res/ 2>/dev/null
echo -ne "$(tstamp)  compiling...\033[0K\r"
$java_compiler -cp soot/sootclasses-trunk-jar-with-dependencies.jar:./src src/main/Main.java 2>/dev/null
echo -e "$(tstamp)  compiled...\033[0K\r"
if ! $java_vm -cp soot/sootclasses-trunk-jar-with-dependencies.jar:./src main.Main $java_install_path null null JDK res > /dev/null; then
    echo
    echo " Execution exited."
    exit 1
fi
##$java_vm -cp soot/sootclasses-trunk-jar-with-dependencies.jar:./src main.Main $java_install_path null null JDK res
echo "$(tstamp)  Dependencies generated for libraries method of program "$class_name" in StagedAnalysis/2.LibraryEvaluation/0.Stava/res/"
echo "Step 1: ............Completed"
echo
echo "Step 2: PrePass (Division of Dependencies as Static and Dynamic)"
rm -r ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/1.PrePass/res 2>/dev/null
ln -sf ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/0.Stava/res ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/1.PrePass/res
##cp -r res/ ../1.PrePass/
cd ${projectpath}/fmsd-artifact//StagedAnalysis/2.LibraryEvaluation/1.PrePass/
echo -ne "$(tstamp)  compiling...\033[0K\r"
$java_compiler Main.java 2>/dev/null
echo -e "$(tstamp)  compiled...\033[0K\r"
bash dynamicout.sh
echo "$(tstamp) Division for libraries generated in StagedAnalysis/2.LibraryEvaluation/1.PrePass/evalout"
echo "Step 2: ............Completed"
echo
echo "Step 3: (Evaluation) Generating Result for dynamic dependencies"
rm -r ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/evalout 2>/dev/null
ln -sf ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/1.PrePass/evalout ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/evalout
#cp -r evalout/ ../2.Evaluator/
cd ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/
echo -ne "$(tstamp)  compiling...\033[0K\r"
$java_compiler Main.java 2>/dev/null
echo -e "$(tstamp)  compiled...\033[0K\r"
bash dynamicout.sh
echo "$(tstamp) Library evaluated result generated in StagedAnalysis/2.LibraryEvaluation/2.Evaluator/finalout"
bash concat.sh
echo "Step3 : ............Completed"
echo "**********************************************************************"
echo
echo "---------- (PHASE 3 and PHASE 4): Specialization and Evaluation  ----------"
echo " Generate Specialized Code for each Program Element as a functions in a single file"
cd ${projectpath}/fmsd-artifact/StagedAnalysis/3.Specializer/MixAlgo-Wrapper
cp ${projectpath}/fmsd-artifact/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/PartialRes.txt .
cp ${projectpath}/fmsd-artifact/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/DynamicOut.txt .
rm -r output 2>/dev/null
mkdir output
bash run.sh
cp DynamicOut.txt output/
echo "$(tstamp) Evaluating the Specialized Code to generate Final Result "
rm -r ${projectpath}/fmsd-artifact/StagedAnalysis/4.PartialResultEvaluation/wrapper/output 2>/dev/null
cp -r output ${projectpath}/fmsd-artifact/StagedAnalysis/4.PartialResultEvaluation/wrapper/
cd ${projectpath}/fmsd-artifact/StagedAnalysis/4.PartialResultEvaluation/wrapper/output
cp ${projectpath}/fmsd-artifact/StagedAnalysis/4.PartialResultEvaluation/wrapper/Wrapper.java ${projectpath}/fmsd-artifact/StagedAnalysis/4.PartialResultEvaluation/wrapper/output
echo -ne "$(tstamp)  compiling...\033[0K\r"
$java_compiler *.java 2>/dev/null
echo -e "$(tstamp)  compiled...\033[0K\r"
time $java_vm Wrapper > out.txt
echo "Final analysis generated in StagedAnalysis/4.PartialResultEvaluation/wrapper/output/out.txt"
echo
echo "******************************** EVALUATION COMPLETED FOR $1 PROGRAM **************************************"
