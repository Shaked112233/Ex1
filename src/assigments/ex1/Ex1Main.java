package assigments.ex1;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2="", quit = "quit";
        int value1, value2,base;
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.nextLine();
            if (!num1.equals("quit")) {
                // add your code here
                value1 = Ex1.number2Int(num1);
                System.out.println("num1=" + num1 + " is number: " + Ex1.isNumber(num1) + " ,value: " + value1);
                if(value1 != -1) {
                    System.out.println("Enter a string as number#2: ");
                    num2 = sc.nextLine();
                    value2 = Ex1.number2Int(num2);
                    System.out.println("num2=" + num2 + " is number: " + Ex1.isNumber(num2) + " ,value: " + value2);
                    if (value2 != -1) {
                        System.out.println("enter a base for output: (a number [2,16])");
                        base = sc.nextInt();
                        sc.nextLine();
                        if (base < 2 || base > 16) {
                            System.out.println("ERR: wrong base, should be [2,16], got (" + base + ")");
                        } else {
                            String sum = Ex1.int2Number(value1 + value2, base);
                            String product = Ex1.int2Number(value1 * value2, base);
                            System.out.println(num1 + " + " + num2 + " = " + sum);
                            System.out.println(num1 + " * " + num2 + " = " + product);
                            String [] arr = {num1, num2, sum, product};
                            int indexOfMax = Ex1.maxIndex(arr);
                            System.out.println("Max number over [" +arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3] + "] is: " +
                                    arr[indexOfMax]);
                        }
                    }
                }
            }
        }
        System.out.println("quiting now...");
    }
}




