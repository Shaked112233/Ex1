package assigments.ex1;
/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String num) {
        int ans = -1,i;
        // add your code here
        int len = num.length();
        int indexOfLastDigit;
        char last = num.charAt(len - 1);
        int base;
        if(len < 3 || num.charAt(len - 2) != 'b'){
            base = 10;
            indexOfLastDigit = len - 1;
        }
        else {
            indexOfLastDigit = len - 3;
            if (last >= '2' && last <= '9') {
                base = last - '0';
            } else {
                if (last >= 'A' && last <= 'G') {
                    base = last - 'A' + 10;
                } else {
                    return ans;
                }
            }
        }
        int value = 0;
        int digit, power = 1;
        char ch;
        for(i = indexOfLastDigit; i >= 0; i--){
            ch = num.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digit = ch - '0';
            }
            else {
                if(ch >= 'A' && ch <= 'F'){
                    digit = ch - 'A' + 10;
                }
                else {
                    return ans;
                }
            }
            if (digit >= base){
                return ans;
            }
            value += digit*power;
            power *= base;
        }
        return value;
    }
    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        // add your code here
        return(number2Int(a) != -1);
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     * @param num the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";

        if ( num < 0 || base > 16 || base < 2) {
            return ans;
        }
        if (num == 0) {
            return "0";
        }

        char[] digits = "0123456789ABCDEFG".toCharArray();

        for (; num > 0; num /= base) {
            int remainder = num % base;
            ans = digits[remainder] + ans;
        }

        return ans + "b" + digits[base];
    }

    ////////////////////
    /**
     * Checks if the two numbers have the same value.
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        // add your code here
        int value1 = number2Int(n1);
        int value2 = number2Int(n2);
        if (value1 == -1 || value2 == -1) {
            return false;
        }
        return (value1 == value2);
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0,i;
        int max = Integer.MIN_VALUE, value;
        // add your code here
        for(i = 0; i < arr.length; i++) {
            value = number2Int(arr[i]);
            if(value > max) {
                max = value;
                ans = i;
            }
        }
        return ans;
    }
}
