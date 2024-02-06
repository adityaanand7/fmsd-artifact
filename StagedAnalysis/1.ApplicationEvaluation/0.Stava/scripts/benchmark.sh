#!/bin/bash
# Script to be used to run the project on a benchmark.

tstamp() { date +[%T]; }

# Arguments: 1) name of benchmark

# Project Path
projectpath=`realpath ../../../../`

# Installed path of Java 8 JDK
java_install_path=`realpath ../../../../jdk1.8.0_301`

# contain individual benchmarks 
benchmarks_base_path="${projectpath}/benchmarks"

# The soot jar to be used.
soot_path=`realpath ../soot/sootclasses-trunk-jar-with-dependencies.jar`

# Path to stava repository
stava_path=`realpath ..`
stava_run="${stava_path}/src/"

# The directory inside which stava will output the results.
output_base_path=`realpath ../output/`

java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

find  ${stava_path}/src -type f -name '*.class' -delete
echo -ne "$(tstamp) Stava compiling...\033[0K\r"
$java_compiler -cp $soot_path:${stava_path}/src ${stava_path}/src/main/Main.java 2>/dev/null
#sleep 0.5
echo -e "$(tstamp) Stava compiled...\033[0K\r"

execute () {
    #echo launching...
    #echo $1 $2 $3
    $java_vm -Xmx10g -Xss2m -classpath $soot_path:$stava_run main.Main $java_install_path true $1 $2 $3
}
clean () {
    #echo clearing output_files...
    find $1 -type f -name '*.res' -delete 2>/dev/null
    find $1 -type f -name '*.info' -delete 2>/dev/null
    find $1 -type f -name 'stats.txt' -delete 2>/dev/null
}
if [[ $1 == "dacapo" ]]; then
    benchmark_path="${benchmarks_base_path}/dacapo"
    output_path="${output_base_path}"
    main_class="Harness"
elif [[ $1 == "moldyn" ]]; then
	benchmark_path="${benchmarks_base_path}/jgf/Moldyn"
    output_path="${output_base_path}"
    main_class="JGFMolDynBenchSizeA"
elif [[ $1 == "raytracer" ]]; then
    benchmark_path="${benchmarks_base_path}/jgf/RayTracer"
    output_path="${output_base_path}"
    main_class="JGFRayTracerBenchSizeA"
else
    echo path not recognised
    exit 0
fi
clean $output_path
find  ${stava_path}/src -type f -name '*.class' -delete
#echo compiling...
$java_compiler -cp $soot_path:${stava_path}/src ${stava_path}/src/main/Main.java 2>/dev/null
#echo compiled!
#echo launching...
execute $benchmark_path $main_class $output_path
