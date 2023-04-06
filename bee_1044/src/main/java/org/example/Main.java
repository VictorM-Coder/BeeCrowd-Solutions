package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1, value2;
        value1 = scanner.nextInt();
        value2 = scanner.nextInt();

        if (value1%value2==0 || value2%value1==0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}