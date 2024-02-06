#!/bin/bash
tstamp() { date +[%T]; }
java_install_path=`realpath ../../../jdk1.8.0_301`
java_compiler="${java_install_path}/bin/javac"
java_vm="${java_install_path}/bin/java"

rm PartialRes.txt 2>/dev/null
echo -ne "$(tstamp)  Evaluator compiling...\033[0K\r"
$java_compiler Main.java 2>/dev/null
echo -e "$(tstamp) compiled...\033[0K\r"
input="prepass.txt"
while IFS= read -r line
do
  echo "$line" > CV.txt
  $java_vm Main < prepass.txt >> PartialRes.txt
  echo -ne ""
done < "$input"
