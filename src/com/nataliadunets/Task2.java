package com.nataliadunets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            int N = scanner.nextInt();
            if (N < 0)
                throw new Exception();
            Collections.addAll(list, 1, 1);
            int i = 1;
            while (list.get(i) + list.get(i - 1) < N) {
                list.add(list.get(i) + list.get(i - 1));
                i++;
            }
            System.out.print(list);
        }
        catch (Exception e) {
            System.out.println("Incorrect value!");
        }
    }
}
