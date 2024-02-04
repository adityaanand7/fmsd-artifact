#!/bin/bash

java_install_path="/home/aditya/Documents/Research-Workspace/JDK/jdk1.8.0_301"
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

rm -r evalout 2>/dev/null
mkdir -p evalout
for file in ./res/*; do
    outfile=$(basename "${file}")
    $java_vm Main <${file} > evalout/${outfile}
done
