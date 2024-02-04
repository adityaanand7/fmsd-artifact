#!/bin/bash
rm amp1-partialresult.txt
input="prepass.txt"
while IFS= read -r line
do
  echo "$line" > CV.txt
  java Main < prepass.txt >> amp1-partialresult.txt
done < "$input"
