package org.example;

import java.util.Scanner;

public class Main {
    static void mostrarSomaEIntervalo(int valor1, int valor2){
        int sum = 0;
        for (int cont = valor1; cont <= valor2; cont++){
            System.out.printf("%d ",cont);
            sum += cont;
        }
        System.out.printf("Sum=%d\n", sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;

        while (true){
            valor1 = scanner.nextInt();
            valor2 = scanner.nextInt();

            if (valor1 <= 0 || valor2 <= 0) break;
            if (valor1 > valor2){
                mostrarSomaEIntervalo(valor2, valor1);
            }else{
                mostrarSomaEIntervalo(valor1, valor2);
            }
        }
        scanner.close();
    }
}