#!/bin/bash

for file in *.txt; do
    iconv -f latin1 -t utf-8 "$file" -o "$file"
done
