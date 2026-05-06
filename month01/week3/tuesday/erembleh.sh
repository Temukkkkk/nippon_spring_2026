#!/bin/bash

read -p "A too:" a
read -p "B too:" b
read -p "C too:" c
 if [[ "$a" -lt "$b" && "$a" -ge "$c" ]]; then
        max=$a
 if [[ "$b" -lt "$c" ]]; then
        mid=$c; min=$b;
 fi
 elif [[ "$b" -lt "$a" && "$b" -ge "$c" ]]; then
        max=$b
 if [[ "$a" -lt "$c" ]]; then
mid=$c; min=$a; fi
   else
        max=$c
 if [[ "$a" -lt "$b" ]]; then
mid=$b; min=$a; fi
fi
        echo "EREMBE: $max, $mid, $min"   
