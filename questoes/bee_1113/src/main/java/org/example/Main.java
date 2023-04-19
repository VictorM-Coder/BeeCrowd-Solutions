package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();

            if (valor1 > valor2){
                System.out.println("Decrescente");
            }else if(valor2 > valor1){
                System.out.println("Crescente");
            }else{
                break;
            }
        }
        scanner.close();
    }
}