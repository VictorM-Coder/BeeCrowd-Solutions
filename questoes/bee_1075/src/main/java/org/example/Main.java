package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        for (int cont = 1; cont < 10000; cont++){
            if (cont%valor==2){
                System.out.println(cont);
            }
        }
    }
}