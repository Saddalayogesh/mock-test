package com.java.mock;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String str = sc.nextLine();

        str = str.toLowerCase().replace(" ", "");

        int i = 0;
        int j = str.length() - 1;

        boolean palindrome = true;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                palindrome = false;
                break;
            }

            i++;
            j--;
        }

        if (palindrome) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome!");
        }
    }
}