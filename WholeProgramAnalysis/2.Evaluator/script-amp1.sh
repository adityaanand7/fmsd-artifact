#!/bin/bash
java_install_path="/home/aditya/Documents/Research-Workspace/JDK/jdk1.8.0_301"
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

rm PartialRes.txt 2>/dev/null
echo " compiling in evaluator..."
$java_compiler Main.java 2>/dev/null
echo " compiled!"
input="prepass.txt"
while IFS= read -r line
do
  echo "$line" > CV.txt
  $java_vm Main < prepass.txt >> PartialRes.txt
done < "$input"
