package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario = scanner.nextFloat();

        if (salario <= 2000){
            System.out.println("Isento");
        }else {
            float imposto = 0;
            imposto += calcularImposto(salario, 4500, Float.MAX_VALUE, 0.28f);
            imposto += calcularImposto(salario, 3000, 4500, 0.18f);
            imposto += calcularImposto(salario, 2000, 3000, 0.08f);
            System.out.printf("R$ %.2f\n", imposto);
        }
        scanner.close();
    }

    public static float calcularImposto(float total, float min, float max, float porcentagem){
        if (total > min){
            return (total >= max)? (max-min)*porcentagem: (total-min)*porcentagem;
        }else{
            return 0;
        }
    }
}