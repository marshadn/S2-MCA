#!/bin/bash
echo "Script name: $0"
echo "Number of arguments: $#"
echo "PID of the script: $$"

if [ $# -gt 0 ]; then
    echo "First argument: $1"
fi

# Run a background command
sleep 10 &
echo "PID of last background command: $!"

echo "Previous argument: $_"
