package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo1, numeroPecas1, codigo2, numeroPecas2;
        float valorUnitario1, valorUnitario2;

        codigo1 = scanner.nextInt();
        numeroPecas1 = scanner.nextInt();
        valorUnitario1 = scanner.nextFloat();
        codigo2 = scanner.nextInt();
        numeroPecas2 = scanner.nextInt();
        valorUnitario2 = scanner.nextFloat();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", numeroPecas1*valorUnitario1 + numeroPecas2*valorUnitario2);
    }
}