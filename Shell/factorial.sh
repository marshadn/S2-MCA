#!/bin/bash

factorial() {
	if [ $1 -le 1 ]
	then
		echo $1
		exit 1
	fi
	ans=1
	i=1
	while [ $i -le $1 ]
	do	ans=$(( $ans * $i ))
		i=$(( $i + 1 ))
	done
	echo $ans
}

read -p "Enter the number: " n
factorial $n
