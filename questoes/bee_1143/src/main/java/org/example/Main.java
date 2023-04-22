package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        for (int cont = 1; cont <= valor; cont++){
            System.out.printf("%d %d %d\n", cont, cont*cont, cont*cont*cont);
        }
        scanner.close();
    }
}