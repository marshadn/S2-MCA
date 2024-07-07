#!/bin/bash
read -p "Enter the numbers:" a b
read -p "Enter the operator:" op
case $op in
    "+") echo "The sum is: $(($a+$b))";;
    "-") echo "The substraction is: $(($a-$b))";;
    "*") echo "The multiplication is: $(($a*$b))";;
    "/") echo "The division is: $(($a/$b))";;
    *) exit 1;;
    esac

