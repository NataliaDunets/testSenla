package com.nataliadunets;

import java.util.Scanner;

class dot {
    int x;
    int y;
}

public class Task3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            dot a = new dot();
            dot b = new dot();
            dot c = new dot();
            dot d = new dot();
            a.x = scanner.nextInt();
            a.y = scanner.nextInt();
            b.x = scanner.nextInt();
            b.y = scanner.nextInt();
            c.x = scanner.nextInt();
            c.y = scanner.nextInt();
            d.x = scanner.nextInt();
            d.y = scanner.nextInt();

            int v1 = (d.x - c.x) * (a.y - c.y) - (d.y - c.y) * (a.x - c.x);
            int v2 = (d.x - c.x) * (b.y - c.y) - (d.y - c.y) * (b.x - c.x);
            int v3 = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
            int v4 = (b.x - a.x) * (d.y - a.y) - (b.y - a.y) * (d.x - a.x);
            boolean inter = false;
            if (v1 * v2 < 0 && v3 * v4 < 0)
                inter = true;
            System.out.println(inter);
        } catch (Exception e) {
            System.out.println("Incorrect value!");
        }
    }
}
