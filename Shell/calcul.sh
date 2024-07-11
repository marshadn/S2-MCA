#!/bin/bash
while true
do
    read -p "Enter 2 nums:" a b
    read -p "Enter the operator:" op
    case $op in
    "+")
    echo "$a + $b = $(($a + $b))"
    ;;
    "-")
    echo "$a - $b = $(($a - $b))"
    ;;
    "*")
    echo "$a * $b = $(($a * $b))"
    ;;
    "/")
    echo "scale=2;$a / $b = $(($a / $b))"
    ;;
    *)
    echo "Invalid operator"
    exit 1
    ;;
    esac
    done