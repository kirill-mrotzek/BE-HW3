package com.telran.org.Homework;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Addition : " + add(num1, num2));
        System.out.println("Subtraction : " + subtract(num1, num2));
        System.out.println("Multiplication : " + multiply(num1, num2));
        System.out.println("Division : " + divide(num1, num2));

        scanner.nextLine();

        System.out.println("Enter a string : ");
        String input = scanner.nextLine();
        String result = inputString(input);
        System.out.println(result);

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public static String inputString(String input) {
        String upperCaseString = input.toUpperCase();
        System.out.println(upperCaseString);
        return reverseString(upperCaseString);
    }

    public static String reverseString(String input) {
        String reverseString = new StringBuilder(input).reverse().toString();
        return (reverseString);
    }
}


