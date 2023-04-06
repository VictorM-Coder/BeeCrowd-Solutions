package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempoGasto, velocidadeMedia;
        tempoGasto = scanner.nextInt();
        velocidadeMedia = scanner.nextInt();
        System.out.printf("%.3f\n", (tempoGasto*velocidadeMedia)/12.0);
    }
}