package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        for (int cont = 1; cont <= valor*4; cont++){
            if (cont%4 == 0){
                System.out.println("PUM");
            }else {
                System.out.print(cont + " ");
            }
        }
        scanner.close();
    }
}