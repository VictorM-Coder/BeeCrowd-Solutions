package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int anos = dias/365;
        dias-= anos*365;

        int meses = dias/30;
        dias-= meses*30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);
    }
}