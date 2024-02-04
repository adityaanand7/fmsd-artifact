#!/bin/bash
#Script for complete artifact

projectpath=`realpath ..`
java_install_path="/home/adityaanand/Documents/Research-Workspace/JDK/jdk1.8.0_301"
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"



if [[ $1 == "benchmark" ]]; then
    echo "*************** Starting the Whole-Program Analysis Evaluation **************"
    echo "Selected Program for Testing is : " $1    
    cd WholeProgramAnalysis/
    echo
    echo "Step 1: Generating all the Dependencies at once (STATIC+DYNAMIC)"
    cd 0.Stava/scripts
    bash jgfbenchmark.sh
    echo
    echo "Step 1: .......... Completed"   
    echo "Dependencies generated for sample program in WholeProgramAnalysis/0.Stava/scripts/CVOUT.txt"
    echo
    cp CVOUT.txt ../../1.PrePass/CVOUT.txt
    echo
    echo "Step 2: PrePass (Division of Dependencies in Static and Dynamic)"
    cd ../../1.PrePass
    $java_compiler Main.java 2>/dev/null
    echo compiled in prepass phase...
    echo
    $java_vm Main < CVOUT.txt > prepass.txt
    echo "Step 2: ............Completed" 
    echo "Division Generated in WholeProgramAnalysis/1.PrePass/prepass.txt"
    echo
    rm ../2.Evaluator/prepass.txt 2>/dev/null
    cp prepass.txt ../2.Evaluator/prepass.txt
    echo "Step 3: (Evaluation) Generating Final Result "
    cd ../2.Evaluator
    bash script-amp1.sh
    echo "Step3 : ............Completed" 
    echo "**********************************************************************"
    echo "Final output generated in WholeProgramAnalysis/2.Evaluator/FinalRes.txt"
    echo
elif [[ $1 == "sample" ]]; then
    echo "*************** Starting the Whole-Program Analysis Evaluation **************"
    echo "Selected Program for Testing is : " $1  
    cd WholeProgramAnalysis/
    echo
    echo "Step 1: Generating all the Dependencies (STATIC+DYNAMIC)"
    cd 0.Stava/scripts
    bash sample.sh
    echo
    echo "Step 1: .......... Completed"   
    echo "Dependencies generated for sample program in WholeProgramAnalysis/0.Stava/scripts/CVOUT.txt"
    echo
    cp CVOUT.txt ../../1.PrePass/CVOUT.txt
    echo
    echo "Step 2: PrePass (Division of Dependencies in Static and Dynamic)"
    cd ../../1.PrePass
    $java_compiler Main.java 2>/dev/null
    echo compiled in prepass phase...
    echo
    $java_vm Main < CVOUT.txt > prepass.txt
    echo "Step 2: ............Completed" 
    echo "Division Generated in WholeProgramAnalysis/1.PrePass/prepass.txt"
    echo
    rm ../2.Evaluator/prepass.txt 2>/dev/null
    cp prepass.txt ../2.Evaluator/prepass.txt
    echo "Step 3: (Evaluation) Generating Final Result "
    cd ../2.Evaluator
    bash script-amp1.sh
    echo "Step3 : ............Completed" 
    echo "**********************************************************************"
    echo "Final output generated in WholeProgramAnalysis/2.Evaluator/FinalRes.txt"
    echo
else
    echo " Wrong Command! USAGE: bash ./wholeprogram.sh value : where value = {sample,benchmark} " 
    exit 0
fi
