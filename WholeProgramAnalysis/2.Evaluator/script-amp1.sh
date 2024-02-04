#!/bin/bash
java_install_path="/home/adityaanand/Documents/Research-Workspace/JDK/jdk1.8.0_301"
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

rm FinalRes.txt 2>/dev/null
echo " compiling in evaluator..."
$java_compiler Main.java 2>/dev/null
echo " compiled!"
input="prepass.txt"
while IFS= read -r line
do
  echo "$line" > CV.txt
  $java_vm Main < prepass.txt >> FinalRes.txt
done < "$input"
