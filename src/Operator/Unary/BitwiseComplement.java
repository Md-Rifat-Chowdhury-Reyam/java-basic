package Operator.Unary;

import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Uncomment this block for user input
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // Initialize num
        int num = 10;

        // Unary plus
        int result = +num;
        System.out.println("The value of result after unary plus is: " + result);

        // Unary minus
        result = -num;
        System.out.println("The value of result after unary minus is: " + result);

        // Pre-increment
        result = ++num;
        System.out.println("The value of result after pre-increment is: " + result);

        // Post-increment
        result = num++;
        System.out.println("The value of result after post-increment is: " + result);

        // Pre-decrement
        result = --num;
        System.out.println("The value of result after pre-decrement is: " + result);

        // Post-decrement
        result = num--;
        System.out.println("The value of result after post-decrement is: " + result);

        result = ~num;
        System.out.println("The value of result after bitwise complement is: " + result);

        // Close the scanner
        sc.close();
    }
}
