package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, duracao;
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        duracao = 24 - valor1 + valor2;
        duracao = (duracao > 24)? duracao-24: duracao;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
}