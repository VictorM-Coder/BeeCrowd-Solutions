package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPercorrido = scanner.nextInt();
        float combustivelGasto = scanner.nextFloat();
        System.out.printf("%.3f km/l\n", totalPercorrido/combustivelGasto);
    }
}