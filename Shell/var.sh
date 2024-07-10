# #!/bin/bash
# echo "Script name: $0"
# echo "Number of arguments: $#"
# echo "All arguments: $@"
# echo "PID of the script: $$"

# if [ $# -gt 0 ]; then
#     echo "First argument: $1"
# fi

# # Run a background command
# sleep 10 &
# echo "PID of last background command: $!"

# # Check exit status of a command
# ls /nonexistent
# echo "Exit status of the last command: $?"

# # Using $_
# echo "Previous argument: $_"
#!/bin/bash

isAmstrong() {
    num=$1
    sum=0
    original_num=$num

    while (( num > 0 ))
    do
        digit=$(( num % 10 ))
        sum=$(( sum + digit * digit * digit ))
        num=$(( num / 10 ))
    done

    echo $sum
}

# Function call
read -p "Enter a number: " num
am=$(isAmstrong $num)

# Check if the number is an Armstrong number
if [ $am -eq $num ]
then
    echo "Armstrong number"
else
    echo "Not an Armstrong number!"
fi
