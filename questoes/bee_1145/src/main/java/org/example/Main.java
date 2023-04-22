package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int cont = 1; cont <= y; cont++){
            System.out.printf("%d", cont);
            if (cont%x==0) {
                System.out.println();
            }else {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}