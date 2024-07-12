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

# echo "Current shell is:$SHELL"
# echo "Current directory  is:$HOME"
# echo "OS is:$OSTYPE"
# echo "Current w.d is:" 
# pwd

#Print lines matching certain word pattern.  
#!/bin/bash 
read -p "Enter a file name: " file1 
echo "Enter contents of $file1: " 
cat > $file1 
read -p "Enter a pattern to search in file: " s 
grep -ni $s $file1 
 
 
 
#!/bin/bash 
i="y" 
read -p "Enter name of database: " db 
while [ $i = "y" ] 
do 
    clear 
    echo "1. View Database" 
    echo "2. View Specific Record" 
    echo "3. Add Record" 
    echo "4. Delete Record" 
    echo "5. Exit" 
    read -p "Enter your choicce: " ch 
    case $ch in 
    1) cat $db;; 
    2) read -p "Enter ID: " id 
       grep -i "$id" $db;; 
    3) read -p "Enter new student ID: " tid 
       read -p "Enter new name: " nm 
       read -p "Enter designation: " des 
       read -p "Enter college name: " college 
       echo "$tid $nm $des $college">>$db;; 
    4) read -p "Enter ID: " id 
       grep -v "$id" $db > dbs1 
       echo "Record is deleted" 
       cat dbs1;; 
    5) exit ;; 
    *) echo "Invalid choice";; 
    esac 
    read -p "Do you want to continue? " i 
    if [ $i != "y" ] 
    then 
    exit 
    fi 
done 

#!/bin/bash

# Function to calculate GCD
gcd() {
    local a=$1
    local b=$2
    while [ $b -ne 0 ]; do
        local temp=$b
        b=$((a % b))
        a=$temp
    done
    echo $a
}

# Function to calculate LCM
lcm() {
    local a=$1
    local b=$2
    echo $(( (a * b) / $(gcd $a $b) ))
}

# Read the two numbers from the user
read -p "Enter the first number: " num1
read -p "Enter the second number: " num2

# Calculate GCD
gcd_result=$(gcd $num1 $num2)
# Calculate LCM
lcm_result=$(lcm $num1 $num2)

# Display the results
echo "The GCD of $num1 and $num2 is: $gcd_result"
echo "The LCM of $num1 and $num2 is: $lcm_result"

  

