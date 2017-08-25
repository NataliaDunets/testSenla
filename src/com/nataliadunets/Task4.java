package com.nataliadunets;

import java.util.Scanner;


public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            if (n1 == 0 || n2 == 0)
                throw new Exception();
            else {
                System.out.println("НОД: " + nod(Math.abs(n1), Math.abs(n2)));
                System.out.println("НОК:" + nok(Math.abs(n1), Math.abs(n2)));
            }
        } catch (Exception e) {
            System.out.println("Incorrect value!");
        }
    }

    private static int nod(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return (nod(n2, n1 % n2));

    }

    private static int nok(int n1, int n2) {
        return n1 / nod(n1, n2) * n2;
    }
}
