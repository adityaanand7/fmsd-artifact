rm DynamicOut.txt
for file in ./finalout/*; do
	cat ${file} >> DynamicOut.txt
done
sed -i '/^$/d' DynamicOut.txt 
