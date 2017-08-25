package com.nataliadunets;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String string = scanner.nextLine();
            string = string.replaceAll("[^, .!?$^()'a-zA-Z]", "");

            System.out.print(string);
        } catch (Exception e) {
            System.out.println("Incorrect value!");
        }
    }
}
