package com.java.mock;

import java.util.Scanner;

public class FactorialRecursion {

    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not possible for negative numbers");
        } else {
            int result = factorial(n);
            System.out.println("Factorial of " + n + " = " + result);
        }
    }
}