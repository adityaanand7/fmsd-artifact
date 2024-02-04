#!/bin/bash
#Script for complete artifact

# Path for the code
projectpath=`realpath ..`

# Installed path of Java 8 JDK
java_install_path=`realpath jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

# Path for Analyzing Code
#class_path="${projectpath}/benchmarks/jgf/Moldyn/"
class_path="${projectpath}/fmsd/benchmarks/tests/mytest/"

#Class Name
#class_name="JGFMolDynBenchSizeA"
class_name="Main"


echo "*************** Starting the Staged Analysis Evaluation **************"
echo "Selected Program for Testing is : " $class_name
cd StagedAnalysis/1.ApplicationEvaluation
echo
echo "---------- PHASE 1: Starting with Application Evaluation (ONLY FOR STATIC PROGRAM ELEMENTS)  ----------"
echo
echo "Step 1 : Generating the Dependencies using Stava"
cd 0.Stava/scripts
bash jgfbenchmark.sh $class_path $class_name
echo " Dependencies generated for static program elements of program "$class_name" in StagedAnalysis/1.ApplicationEvaluation/0.Stava/scripts/CVOUT.txt"
echo "Step 1: .......... Completed"   
echo
cp CVOUT.txt ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/1.PrePass/CVOUT.txt
echo "Step 2: PrePass (Division of Dependencies as Static and Dynamic)"
cd ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/1.PrePass
echo " compiling..."
$java_compiler Main.java 2>/dev/null
echo " compiled prepass files!"
$java_vm Main < CVOUT.txt > out.txt
echo " Division Generated in StagedAnalysis/1.ApplicationEvaluation/1.PrePass/out.txt"
echo "Step 2: ............Completed" 
echo
cp out.txt ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/prepass.txt
echo "Step 3: (Evaluation) Generating Partial Result "
cd ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator
bash script-amp1.sh
echo " Partial Result Generated in StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/PartialRes.txt"
echo "Step3 : ............Completed" 
echo "**********************************************************************"
echo 
echo
echo "---------- PHASE 2: Starting with Library Evaluation  (ONLY DYNAMIC PROGRAM ELEMENTS)  ----------"
echo
echo "Step 1: Generating the Dependencies using stava"
cd ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/1.PrePass/
sort -u AllDynamicList.txt > DynamicList.txt
cp DynamicList.txt ${projectpath}/StagedAnalysis/2.LibraryEvaluation/0.Stava/
cd ${projectpath}/StagedAnalysis/2.LibraryEvaluation/0.Stava/
rm -r res/ 2>/dev/null
echo " compiling..."
$java_compiler -cp soot/sootclasses-trunk-jar-with-dependencies.jar:./src src/main/Main.java 2>/dev/null
echo " compiled..."
if ! $java_vm -cp soot/sootclasses-trunk-jar-with-dependencies.jar:./src main.Main $java_install_path null null JDK res; then
    echo
    echo " Execution exited."
    exit 1
fi
#$java_vm -cp soot/sootclasses-trunk-jar-with-dependencies.jar:./src main.Main $java_install_path null null JDK res
echo " Dependencies generated for libraries method of program "$class_name" in StagedAnalysis/2.LibraryEvaluation/0.Stava/res/"
echo "Step 1: ............Completed"
echo
echo "Step 2: PrePass (Division of Dependencies as Static and Dynamic)"
rm -r ${projectpath}/StagedAnalysis/2.LibraryEvaluation/1.PrePass/res/ 2>/dev/null
ln -sf ${projectpath}/StagedAnalysis/2.LibraryEvaluation/0.Stava/res ${projectpath}/StagedAnalysis/2.LibraryEvaluation/1.PrePass/res
#cp -r res/ ../1.PrePass/
cd ${projectpath}/StagedAnalysis/2.LibraryEvaluation/1.PrePass/
echo " compiling ..."
$java_compiler Main.java 2>/dev/null
echo " compiled ..."
bash dynamicout.sh
echo " Division for libraries generated in StagedAnalysis/2.LibraryEvaluation/1.PrePass/evalout"
echo "Step 2: ............Completed" 
echo
echo "Step 3: (Evaluation) Generating Result for dynamic dependencies"
rm -r ${projectpath}/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/evalout/ 2>/dev/null
ln -sf ${projectpath}/StagedAnalysis/2.LibraryEvaluation/1.PrePass/evalout ${projectpath}/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/evalout
#cp -r evalout/ ../2.Evaluator/
cd ${projectpath}/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/
echo " compiling..."
$java_compiler Main.java 2>/dev/null
echo " compiled..."
bash dynamicout.sh
echo " Evalution Done. Evaluated Result generated in StagedAnalysis/2.LibraryEvaluation/2.Evaluator/finalout"
bash concat.sh
echo "Step3 : ............Completed" 
echo "**********************************************************************"
echo 
echo "---------- (PHASE 3 and PHASE 4): Starting with Specialization and Evaluation  ----------"
echo
echo " 1. First Way : Generate Specialized Code for each Program Elements seperately"
cd ${projectpath}/StagedAnalysis/3.Specializer/1.MixAlgo-Normal
cp ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/PartialRes.txt .
cp ${projectpath}/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/DynamicOut.txt .
rm -r output 2>/dev/null
mkdir output
bash run.sh
cp DynamicOut.txt output/
echo " Evaluating the Specialized Code to generate Final Result "
rm -r ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/Evaluation/output 2>/dev/null
cp -r output ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/Evaluation/
cd ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/Evaluation/output
$java_compiler *.java 2>/dev/null
echo " compiled..."
cd ..
{ time bash eval-normal.sh ; }
echo "Final analysis generated in StagedAnalysis/4.PartialResultEvaluation/Evaluation/output/out.txt"
echo
echo " 2. Second Way (WRAPPER): Generate Specialized Code for each Program Element as a functions in a single file"
echo
cd ${projectpath}/StagedAnalysis/3.Specializer/2.MixAlgo-Wrapper
cp ${projectpath}/StagedAnalysis/1.ApplicationEvaluation/2.Evaluator/PartialRes.txt .
cp ${projectpath}/StagedAnalysis/2.LibraryEvaluation/2.Evaluator/DynamicOut.txt .
rm -r output 2>/dev/null
mkdir output
bash run.sh
cp DynamicOut.txt output/
echo " Evaluating the Specialized Code to generate Final Result "
rm -r ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/wrapper/output 2>/dev/null
cp -r output ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/wrapper/
cd ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/wrapper/output
cp ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/wrapper/Wrapper.java ${projectpath}/StagedAnalysis/4.PartialResultEvaluation/wrapper/output
$java_compiler *.java 2>/dev/null
echo " compiled..."
time $java_vm Wrapper > out.txt
echo "Final analysis generated in StagedAnalysis/4.PartialResultEvaluation/wrapper/output/out.txt"
echo
echo "******************************** EVALUATION COMPLETED FOR $1 PROGRAM **************************************"
