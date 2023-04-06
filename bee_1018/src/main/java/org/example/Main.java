package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        System.out.println(total);
        total = extrairNotasEImprimir(total, 100);
        total = extrairNotasEImprimir(total, 50);
        total = extrairNotasEImprimir(total, 20);
        total = extrairNotasEImprimir(total, 10);
        total = extrairNotasEImprimir(total, 5);
        total = extrairNotasEImprimir(total, 2);
        total = extrairNotasEImprimir(total, 1);
    }

    public static int extrairNotasEImprimir(int total, int desconto){
        int cedulas = total/desconto;
        System.out.printf("%d nota(s) de R$ %d,00\n", cedulas, desconto);
        return total-cedulas*desconto;
    }
}