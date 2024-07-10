#!/bin/bash

isPrime() {
	if (( $1 < 2 )); then
		echo "$1 is Not Prime!"
		return
	fi
	for (( i=2; i<$1; i++ ))
	do
		if (( $1 % $i == 0 ))
		then
			echo "$1 is Not Prime!"
			return
		fi
	done
	echo "$1 is Prime!"
}

read -p "Enter the number: " num && isPrime $num
