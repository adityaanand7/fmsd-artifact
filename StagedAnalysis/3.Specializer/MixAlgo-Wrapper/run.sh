#!/bin/bash
tstamp() { date +[%T]; }

java_install_path=`realpath ../../../jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

find . -name "*.class" -delete
find . -name "SpecializedCode.java" -delete
echo -ne "$(tstamp)  compiling...\033[0K\r"
$java_compiler Main.java 2>/dev/null
echo -e "$(tstamp)  compiled...\033[0K\r"
$java_vm Main < Evaluator.java
echo "$(tstamp) Specialized code generated."
cp CV.java output/
cp Dependency.java output/
cp PE.java output/
