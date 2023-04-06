package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4*a*c;
        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        }else{
            double sqrtDelta = Math.sqrt(delta);
            System.out.printf("R1 = %.5f\n", (-b + sqrtDelta)/(2*a));
            System.out.printf("R2 = %.5f\n", (-b - sqrtDelta)/(2*a));
        }
    }
}