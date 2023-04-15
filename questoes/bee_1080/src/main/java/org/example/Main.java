package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior, indice;

        maior = scanner.nextInt();
        indice = 1;
        for (int cont = 2; cont <= 100; cont++){
            int valor = scanner.nextInt();
            if (valor > maior){
                maior = valor;
                indice = cont;
            }

        }
        System.out.println(maior + "\n" + indice);
        scanner.close();
    }
}