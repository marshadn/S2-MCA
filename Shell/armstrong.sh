#!/bin/bash

isAmstrong() {
	num=$1
	sum=0
	while (( $num > 0 ))
	do
		digit=$(( $num % 10 ))
		sum=$(( $sum + $(( $digit * $digit * $digit )) ))
		num=$(( $num / 10 ))
	done
	#return $(( $1 == $sum ))
    echo $sum
}

# Function call
read -p "Enter a number: " num
am=$(isAmstrong $num)
#echo $am;
#echo $num;
# Check the return value (exit status) of the function

if [ $am -eq $num ]
then
    echo "Armstrong number"
else
    echo "Not an Armstrong number!"
fi
# if [ $am -eq $num ]
# then
# 	echo "Amstrong number"
# else
# 	echo "Not an Amstrong number!"
# fi