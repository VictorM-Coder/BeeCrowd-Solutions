package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        float nota1, nota2, nota3;

        for (int cont = 0; cont < valor; cont++){
            nota1 = scanner.nextFloat();
            nota2 = scanner.nextFloat();
            nota3 = scanner.nextFloat();

            System.out.printf("%.1f\n", (nota1*2+nota2*3+nota3*5)/10);
        }
        scanner.close();
    }
}