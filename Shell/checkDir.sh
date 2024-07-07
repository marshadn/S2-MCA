#!/bin/bash

read -p "Enter directory name you want to search: " dir
dir_path="/mnt/c/Users/Lenovo/degree/Desktop/File(s)/JAVAC/$dir"

if [ -d "$dir_path" ]; then
    for filename in "$dir_path"/*; do
        if [ -d "$filename" ]; then
            echo "$filename is a directory"
        else
            echo "$filename is not a directory"
        fi
    done
else
    echo "$dir_path is not a valid directory"
fi
