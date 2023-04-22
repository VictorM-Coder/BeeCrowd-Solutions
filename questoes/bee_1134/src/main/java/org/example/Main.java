package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totAlcool = 0, totGasolina = 0, totDiesel = 0;
        while (true){
            int valor = scanner.nextInt();
            switch (valor){
                case 1: totAlcool++; continue;
                case 2: totGasolina++; continue;
                case 3: totDiesel++; continue;
            }
            if (valor == 4) break;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", totAlcool, totGasolina, totDiesel);
        scanner.close();
    }
}