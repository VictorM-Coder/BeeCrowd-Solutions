package org.example;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    private static void sort(double[] lados){
        for (int cont = 0; cont < lados.length; cont++){
            for (int cont1 = cont; cont1 < lados.length; cont1++){
                if (lados[cont] > lados[cont1]){
                    double temp = lados[cont];
                    lados[cont] = lados[cont1];
                    lados[cont1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] lados = new double[3];

        for (int cont = 0; cont < 3; cont++) lados[cont] = scanner.nextDouble();
        sort(lados);
        double sqrtLadoA = pow(lados[2], 2);
        double sqrtLadoBMaisLadoC = pow(lados[1], 2) + pow(lados[0], 2);

        if (lados[2] >= (lados[1] + lados[0])){
            System.out.println("NAO FORMA TRIANGULO");
        }else{
            if (sqrtLadoA == sqrtLadoBMaisLadoC){
                System.out.println("TRIANGULO RETANGULO");
            } else if (sqrtLadoA > sqrtLadoBMaisLadoC){
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (lados[0]==lados[1] && lados[1]==lados[2]){
                System.out.println("TRIANGULO EQUILATERO");
            }else if (lados[2]==lados[1] || lados[0]==lados[1] || lados[0]==lados[2]){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}