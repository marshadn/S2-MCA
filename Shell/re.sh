#!/bin/bash
s="hellllooooo"
r=$(echo "$s" | rev)
echo $r | cat > f.txt
cat f.txt