package com.nataliadunets;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IllegalArgumentException {
        int N;

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            N = scanner.nextInt();
            if (N < 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Incorrect value!");
            return;
        }
        list.add(2);
        for (int i = 3; i < N + 1; i += 2) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) > (int) (Math.sqrt(i)) + 1) {
                    list.add(i);
                    break;
                }
                if (i % list.get(j) == 0)
                    break;
                else if (j == list.size() - 1) {
                    list.add(i);
                    break;
                }

            }

        }
        System.out.print(list);
    }
}
