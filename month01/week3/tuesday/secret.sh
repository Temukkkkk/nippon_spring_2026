#!/bin/bash

secret=42

while true; 
do
read -p "Guess the number (1-100);" guess
 if [ "$guess" -eq "$secret" ]; then
	echo "Congratulation"
break
elif [ "$guess" -ge "$secret" ]; then
	echo "It's big"
else
	echo "it is low"
 fi
done
