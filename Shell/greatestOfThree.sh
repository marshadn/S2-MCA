#!/bin/bash
read -p "Enter 3 numbers:" a b c
if [ $a -gt $b ] && [ $a -gt $c ]
then
    echo "$a is the largest number"
elif [ $b -gt $a ] && [ $b -gt $c ]
then
    echo "$b is the largest number"
else
    echo "$c is the largest number"
fi

