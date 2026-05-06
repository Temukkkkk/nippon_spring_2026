#!/bin/bash

read -p "Enter you month number (1-12): " month

case $month in
	12|1|2)
	echo "Winter";;
	3|4|5)
	echo "Spring";;
	6|7|8)
	echo "Summer";;
	9|10|11)
	echo "Autumn";;
	*)
	echo "Wrong month";;
esac
