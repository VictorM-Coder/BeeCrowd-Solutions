package org.example;

import java.util.Scanner;

public class Main {

    static void showQeR(int dividendo, int divisor){
        if (dividendo < 0 && dividendo%divisor!=0){
            int q = (dividendo/divisor);
            q += divisor < 0? 1: -1;
            int r = dividendo + divisor*-q;
            System.out.printf("%d %d\n", q, r);
        }else {
            System.out.printf("%d %d\n ", dividendo/divisor, dividendo%divisor);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividendo = scanner.nextInt();
        int divisor = scanner.nextInt();
        showQeR(dividendo, divisor);
        scanner.close();
    }
}