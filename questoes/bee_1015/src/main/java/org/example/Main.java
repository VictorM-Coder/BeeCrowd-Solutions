package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1, x2, y1, y2;
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
    }
}