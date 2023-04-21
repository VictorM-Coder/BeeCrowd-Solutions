package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas =  new float[2];

        for (int cont = 0; cont < 2; ) {
            float valor =  scanner.nextFloat();
            if (valor < 0 || valor > 10) {
                System.out.println("nota invalida");
            } else {
                notas[cont] = valor;
                cont++;
            }
        }
        System.out.printf("media = %.2f\n", (notas[0]+notas[1])/2);
    }
}