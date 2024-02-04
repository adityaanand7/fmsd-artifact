#!/bin/bash

java_install_path=`realpath ../../../jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

cd output 
rm out.txt 2>/dev/null
for file in SpecializedCode*.java; do
    CLASSFILE=$(basename "${file}" .java)
    $java_vm $CLASSFILE >> out.txt
done
cd - > /dev/null
