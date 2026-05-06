#!/bin/bash

echo "First number"
read a

echo "(+ - * /)"
read op

echo "Second number"
read b

case "$op" in
	"+")
	echo "Result $((a + b))";;
	"-")
	echo "Result $((a - b))";;
	"*")
	echo "Result $((a * b))";;
	"/")
	echo "Result $((a / b))";;
esac
