package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntPares = 0;

        for (int cont = 1; cont <= 5; cont++){
            float valor = scanner.nextFloat();
            qntPares += (valor%2==0)? 1:0;
        }
        System.out.printf("%d valores pares\n", qntPares);
        scanner.close();
    }
}