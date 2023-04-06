package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        System.out.printf("MEDIA = %.5f\n", (3.5*nota1+7.5*nota2)/11);
    }
}