package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        float salarioFixo = scanner.nextFloat();
        float totalVendas = scanner.nextFloat();
        System.out.printf("TOTAL = R$ %.2f\n", salarioFixo + totalVendas*0.15);
    }
}