package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorA, valorB, valorC;
        valorA = scanner.nextFloat();
        valorB = scanner.nextFloat();
        valorC = scanner.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n", valorA*valorC/2, 3.14159*valorC*valorC, (valorA+valorB)*valorC/2, valorB*valorB, valorA*valorB);
        scanner.close();
    }
}