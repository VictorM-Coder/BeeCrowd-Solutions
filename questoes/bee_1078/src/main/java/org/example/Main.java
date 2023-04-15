package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        for (int cont = 1; cont <= 10; cont++){
            System.out.printf("%d x %d = %d\n", cont, valor, valor*cont);
        }
        scanner.close();
    }
}