package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int cont = 1; cont <= n; cont++){
            System.out.printf("%d %d %d\n", cont, cont*cont, cont*cont*cont);
            System.out.printf("%d %d %d\n", cont, cont*cont+1, cont*cont*cont+1);
        }
        scanner.close();
    }
}