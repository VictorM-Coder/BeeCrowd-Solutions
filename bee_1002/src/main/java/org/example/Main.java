package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        System.out.printf("A=%.4f\n", 3.14159*raio*raio);
    }
}