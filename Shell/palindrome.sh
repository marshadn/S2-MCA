#!/bin/bash

isPalindrome(){
    rev=0;
    num=$1;

    while [ $num -gt 0 ]
        do
        rem=$(($num % 10));
        rev=$(($rev * 10 + $rem));
        num=$(($num / 10));

        done

        if [ $n -eq $rev ]
        then
            echo "The number is a palindrome";
        else
            echo "The number is not a palindrome";
fi

}
read -p "Enter the number:" n
isPalindrome $n

