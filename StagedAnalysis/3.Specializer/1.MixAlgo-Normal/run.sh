#!/bin/bash

java_install_path=`realpath ../../../jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

find . -name "*.class" -delete
find . -name "SpecializedCode.java" -delete
$java_compiler Main.java 2>/dev/null
echo " compiled..."
$java_vm Main < Evaluator.java
echo " specialized code generated"
cp CV.java output/
cp Dependency.java output/
cp PE.java output/
