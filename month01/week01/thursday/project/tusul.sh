#!/bin/bash
PASSWORD="1234"
mkdir -p project/src -p project/docs -p project/tests
touch README.md
echo "My-app" >> README.md
echo "$(date)" >> README.md
echo "$(whoami)" >> README.md
get init
git add README.md
git commit -m "tusul1"
git branch -M main
git remote add origin git@github.com:Temukkkkk/tusul1.git
git push -u origin main

