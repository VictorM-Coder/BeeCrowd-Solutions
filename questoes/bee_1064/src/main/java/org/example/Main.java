package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntPositivos = 0;
        float totalPositivos = 0;

        for (int cont = 1; cont <= 6; cont++){
            float valor = scanner.nextFloat();
            if(valor>0) {
                qntPositivos++;
                totalPositivos += valor;
            }
        }
        System.out.printf("%d valores positivos\n%.1f\n", qntPositivos, totalPositivos/qntPositivos);
    }
}