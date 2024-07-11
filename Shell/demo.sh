#!/bin/bash

# read -p "Enter number: " n
# num=$n
# rev=0

# while [ $num -gt 0 ]
# do
#     ld=$(($num % 10))
#     rev=$(($rev * 10 + $ld))
#     num=$(($num / 10))
# done

# echo "$n after reverse is: $rev"


# s1="HI Helllo "
# s2="What is Going "
# s3="$s1 $s2"
# s3+="you know man"
# echo "$s3"

# read -p "Enter the string:" str
# read -p "Enter the starting index & num.of chars:" a b
# substring=${str:$a:$b}
# echo "$substring"

# read -p "Enter the number:" n
# fact=1
# num=$n
# while [ $n -gt 0 ]
# do
# fact=$(($fact * $n))
# n=$(($n - 1))
# done
# echo "Factorial of $num=$fact"

# read -p "enter the number:" n
# num=$n
# rev=0
# while [ $n -gt 0 ]
# do  
#     ld=$(($n%10))
#     rev=$(($rev*10+$ld))
#     n=$(($n/10))
# done
# if [ $rev -eq $num ]
# then
#     echo "$num is Palindrome"
#     else
#     echo "$num is not Palindrome"
# fi

# read -p "Enter the no.of terms:" n
# a=0
# b=1
# for (( i=0;i<n;i++ ))
# do
#     c=$(($a+$b))
#     echo -n  "  $a  "
#     a=$b
#     b=$c
# done

# read -p "Enter a string:" str
# echo "reverse of $str is"
# echo $str | rev

echo "Current shell is:$SHELL"
echo "Current directory  is:$HOME"
echo "OS is:$OSTYPE"
echo "Current w.d is:" 
pwd