package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1, lado2, porcentagem;

        while(true){
            lado1 = scanner.nextInt();
            if (lado1==0)return;

            lado2 = scanner.nextInt();
            porcentagem = scanner.nextInt();

            int value = (int) Math.sqrt((lado2 * lado1 * 100) / porcentagem);
            System.out.print(value + "\n");
        }
    }
}