package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        float valorPorHora;
        numeroFuncionario = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorPorHora = scanner.nextFloat();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numeroFuncionario, horasTrabalhadas*valorPorHora);
    }
}