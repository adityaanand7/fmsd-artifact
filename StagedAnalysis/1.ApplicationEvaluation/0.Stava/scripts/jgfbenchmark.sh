#!/bin/bash
# Sample script to be used to run the project on a benchmark.

# Arguments: 1) name of benchmark
# Installed path of Java 8 JDK
java_install_path="/home/aditya/Documents/Research-Workspace/JDK/jdk1.8.0_301"

# Path to the directory containing all benchmarks. The subdirectories here must
# contain individual benchmarks 

benchmarks_base_path=`realpath ../../../../benchmarks/`
benchmark_path="${1}"
output_base_path=`realpath ../out/`
output_path="${output_base_path}/jgf/JGFMolyBench"
main_class="$2"

# The soot jar to be used.
soot_path=`realpath ../soot/sootclasses-trunk-jar-with-dependencies.jar`

# Path to stava repository
stava_path=`realpath ..`
stava_run="${stava_path}/src/"
# The directory inside which stava will output the results.

java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

#Compile the benchmark main class
echo " compiling main class" $main_class
$java_compiler -cp $benchmark_path $benchmark_path$main_class.java 2>/dev/null
echo " compiled..."
 
execute () {
    echo " launching..."
    $java_vm -classpath $soot_path:$stava_run main.Main $java_install_path true $1 $2 $3
}

find  ${stava_path}/src -type f -name '*.class' -delete
echo " compiling in stava..."
$java_compiler -cp $soot_path:${stava_path}/src ${stava_path}/src/main/Main.java 2>/dev/null
echo " compiled!"
echo  " launching stava..."
execute $benchmark_path $main_class $output_path
