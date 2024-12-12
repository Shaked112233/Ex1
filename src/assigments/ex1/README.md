README - Ex1: Number Formatting Converter and Calculator
Overview
This project is part of the "Introduction to Computer Science" course at Ariel University. It handles numbers as strings in different bases (2–16) and performs basic operations like validation, conversion, and comparison.

Features
number2Int(String num)
Converts a formatted string (e.g., 101b2) into a decimal number. Returns -1 if invalid.

isNumber(String a)
Checks if a string is a valid number format. Returns true for valid numbers, false otherwise.

int2Number(int num, int base)
Converts a decimal number into a string in the given base. Handles bases 2–16. Returns an empty string for invalid input.

equals(String n1, String n2)
Compares two string numbers based on their decimal values.

maxIndex(String[] arr)
Finds the index of the largest number in a string array. Returns -1 if the array is empty or invalid.

Key Points
How to Use
Open the project in IntelliJ or any Java IDE.
Run Ex1Main.java.
Follow the prompts to enter numbers and their base.
See results for addition, multiplication, and the largest number in an array.
Example
Input:

Number 1: 1011b2
Number 2: 11b3
Base: 10
Output:

1011b2 + 11b3 = 13
1011b2 * 11b3 = 36
Max number: 36
