package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();
        int horas = segundos/3600;
        segundos-=horas*3600;

        int minutos = segundos/60;
        segundos-= minutos*60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}