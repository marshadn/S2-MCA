#!/bin/bash

# read -p "Enter the number:" 
if [ $(($1%2)) -eq 0 ]
then
    echo "$1 is Even"
    else
    echo "$1 is Odd"
    fi

# read -p "Enter the number:" num
# if [ $(($num % 2)) -eq 0 ]
# then
#     echo "$num is even"
# else
#     echo "$num is odd"
#     fi

