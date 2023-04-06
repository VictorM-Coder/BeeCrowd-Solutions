package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = scanner.nextDouble();

        System.out.println("NOTAS:");
        total = extrairNotasEImprimir(total, 100);
        total = extrairNotasEImprimir(total, 50);
        total = extrairNotasEImprimir(total, 20);
        total = extrairNotasEImprimir(total, 10);
        total = extrairNotasEImprimir(total, 5);
        total = extrairNotasEImprimir(total, 2);

        total *=100;
        System.out.println("MOEDAS:");
        total = extrairMoedasEImprimir(total, 100);
        total = extrairMoedasEImprimir(total, 50);
        total = extrairMoedasEImprimir(total, 25);
        total = extrairMoedasEImprimir(total, 10);
        total = extrairMoedasEImprimir(total, 5);
        extrairMoedasEImprimir(total, 1);
    }

    public static double extrairNotasEImprimir(double total, int desconto){
        int cedulas = ((int)total)/desconto;
        System.out.printf("%d nota(s) de R$ %d.00\n", cedulas, desconto);
        return total-cedulas*desconto;
    }

    public static double extrairMoedasEImprimir(double total, int descontoEmCentavos){
        int moeda = ((int)total)/descontoEmCentavos;
        System.out.printf("%d moeda(s) de R$ %.2f\n", moeda, descontoEmCentavos/100.0);
        return total-(moeda*descontoEmCentavos);
    }
}