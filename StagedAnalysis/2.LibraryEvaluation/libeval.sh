#!/bin/bash
#Script for complete artifact
# Installed path of Java 8 JDK
# Path for the code
projectpath=`realpath ../../`

# Installed path of Java 8 JDK
java_install_path=`realpath ../jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"


    echo
    echo "---------- PHASE 2: Starting with Library Evaluation  (ONLY DYNAMIC PROGRAM ELEMENTS)  ----------"
    echo
    echo "Step 1: Generating the Dependencies"
    cd 0.Stava/
    cp /home/aditya/FMSD/StagedAnalysis/1.ApplicationEvaluation/1.PrePass-callback/AllDynamicList.txt .
    sort -u AllDynamicList.txt > DynamicList.txt
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
    echo " Dependencies generated for libraries method of program " $1 " in StagedAnalysis/2.LibraryEvaluation/0.Stava/res/"
    echo "Step 1: ............Completed"
    echo
    echo "Step 2: PrePass (Division of Dependencies as Static and Dynamic)"
    rm -r ../1.PrePass/res/ 2>/dev/null
#    ln -sf $(pwd)/res ../1.PrePass/res
    cp -r res/* ../1.PrePass/res/
    cd ../1.PrePass/
    echo " compiling ..."
    $java_compiler Main.java 2>/dev/null
    echo " compiled ..."
    time bash dynamicout.sh
    echo " Division for libraries generated in StagedAnalysis/2.LibraryEvaluation/1.PrePass/evalout"
    echo "Step 2: ............Completed" 
    echo
    echo "Step 3: (Evaluation) Generating Result for dynamic dependencies"
    rm -r ../2.Evaluator/evalout/ 2>/dev/null
#    ln -sf $(pwd)/evalout ../2.Evaluator/evalout
    cp -r evalout/* ../2.Evaluator/evalout/
    cd ../2.Evaluator/
    echo " compiling..."
    $java_compiler Main.java 2>/dev/null
    echo " compiled..."
    time bash dynamicout.sh
    echo " Evalution Done. Evaluated Result generated in StagedAnalysis/2.LibraryEvaluation/2.Evaluator/finalout"
    bash concat.sh
    echo "Step3 : ............Completed" 
    echo "**********************************************************************"
