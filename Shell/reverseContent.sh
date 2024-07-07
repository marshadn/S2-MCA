#!/bin/bash

# Check if the correct number of arguments are provided
if [ "$#" -ne 2 ]; then
    echo "Usage: $0 input_file output_file"
    exit 1
fi

# Input and output file names
input_file="$1"
output_file="$2"

# Reverse the content of the input file and save it to the output file
tac "$input_file" > "$output_file"

echo "The content of $input_file has been reversed and saved to $output_file"
