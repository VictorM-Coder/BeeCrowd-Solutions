package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.printf("%d eh o maior\n", maior(a, b, c));
    }
    public static int maior(int a, int b, int c){
        int maior1 = (a+b+Math.abs((a-b)))/2;
        return (maior1+c+Math.abs((maior1-c)))/2;
    }
}