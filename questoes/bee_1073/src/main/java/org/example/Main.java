package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num += (num%2==0)? 0:1;

        for (int cont = 2; cont <= num; cont+=2){
            System.out.printf("%d^2 = %d\n", cont, cont*cont);
        }
    }
}