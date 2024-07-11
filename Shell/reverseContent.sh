#!/bin/bash
if [ $# -eq 1 ]
then
 if [ -f  $1 ]
    then    
     echo "Before Reverse: $1"
     cat $1
     echo "After Reverse: $1"
     tac $1
    else
    echo "$1 File does not exist"
    fi
    else
    echo "Please enter a file name"
    fi
