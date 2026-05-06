#!/bin/bash

i=1
while [ $i -le 10 ]; do 
	echo "5 * $i = $((5 * i))"
	i=$(( i + 1 ));
done
