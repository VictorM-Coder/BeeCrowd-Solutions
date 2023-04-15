package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt() ;
        num += (num%2==0)? 1: 0;
        for (int cont = 0; cont <= 5; cont++, num+=2) System.out.println(num);
    }
}