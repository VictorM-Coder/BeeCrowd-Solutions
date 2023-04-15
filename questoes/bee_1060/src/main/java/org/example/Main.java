package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntPositivos = 0;
        for (int cont = 1; cont <= 6; cont++){
            float valor = scanner.nextFloat();
            qntPositivos += (valor>0)? 1:0;
        }
        System.out.printf("%d valores positivos\n", qntPositivos);
    }
}