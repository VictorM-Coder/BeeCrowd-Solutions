package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int cont = 1; cont <= num; cont+=2){
            System.out.println(cont);
        }
        scanner.close();
    }
}