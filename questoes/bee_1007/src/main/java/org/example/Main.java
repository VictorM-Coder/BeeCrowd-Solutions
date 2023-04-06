package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notaA, notaB, notaC, notaD;
        notaA = scanner.nextInt();
        notaB = scanner.nextInt();
        notaC = scanner.nextInt();
        notaD = scanner.nextInt();
        System.out.printf("DIFERENCA = %d\n", notaA*notaB-notaC*notaD);
    }
}