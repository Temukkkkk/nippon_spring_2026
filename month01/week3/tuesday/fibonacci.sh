#!/bin/bash

read -p "N toog oruulna uu:" n
a=0
b=1
counter=0

	echo "Fibonaccin daraalal:"
while [ $counter -lt $n ]; 
do
	echo -n " $a "
	c=$((a + b))
	a=$b
	b=$c
	counter=$((counter + 1))
done
echo " " 
