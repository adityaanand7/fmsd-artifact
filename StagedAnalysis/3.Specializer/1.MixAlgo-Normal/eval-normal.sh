#!/bin/bash

java_install_path=`realpath ../../../jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

cd output 
rm out.txt
for file in SpecializedCode*.java; do
    CLASSFILE=$(basename "${file}" .java)
    java $CLASSFILE >> out.txt
done
cd -
