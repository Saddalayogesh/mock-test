package com.java.mock;

import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Word1: ");
        String s1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Word2: ");
        String s2 = sc.nextLine().toLowerCase().replace(" ", "");

        int[] count = new int[26];

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            count[ch1 - 'a']++;
            count[ch2 - 'a']--;
        }

        boolean anagram = true;

        for (int i = 0; i < 26; i++) {

            if (count[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}