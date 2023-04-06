package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float raio = scanner.nextFloat();
        System.out.printf("VOLUME = %.3f\n", (4.0/3)*3.14159*raio*raio*raio);
    }
}