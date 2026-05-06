#!//bin/bash

PRICE=2500

while true
do
read -p "Mungun dungee oruulna uu:" money

if [ "$money" -ge "$PRICE" ]; then

hariult=$((money - PRICE))
	echo "guilgee amjilttai. tanii hariult:$hariult"
break
 else
	echo "Hureltsehgui baina,dahin orldono uu."
fi
 done

echo""
