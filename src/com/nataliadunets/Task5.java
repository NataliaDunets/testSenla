package com.nataliadunets;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String string = scanner.nextLine();
            boolean isPalindrome = false;
            for (int i = 0; i < string.length() / 2; i++) {
                if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                    System.out.print("This word is not a palindrome!");
                    isPalindrome = false;
                    break;
                } else
                    isPalindrome = true;
            }
            if (isPalindrome)
                System.out.print("This word is a palindrome!");
        } catch (Exception e) {
            System.out.println("Incorrect value!");
        }
    }
}
