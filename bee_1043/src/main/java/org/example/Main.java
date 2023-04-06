package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado1, lado2, lado3;
        lado1 = scanner.nextDouble();
        lado2 = scanner.nextDouble();
        lado3 = scanner.nextDouble();

        if ((lado1+lado2>lado3) && (lado2+lado3>lado1) && (lado3+lado1>lado2)){
            System.out.println("Perimetro = " + (lado1+lado2+lado3));
        }else {
            System.out.println("Area = " + (lado1+lado2)*lado3/2);
        }
    }
}