package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        int reajuste;

        if (salario <= 400) reajuste = 15;
        else if (salario <= 800) reajuste = 12;
        else if (salario <= 1200) reajuste = 10;
        else if (salario <= 2000) reajuste = 7;
        else reajuste = 4;

        double valorAjuste = salario*(reajuste/100.0);
        salario += valorAjuste;
        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", salario, valorAjuste, reajuste);


        scanner.close();
    }
}