package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.print("Q1\n");
        } else if (x < 0 && y > 0) {
            System.out.print("Q2\n");
        } else if (x < 0 && y < 0) {
            System.out.print("Q3\n");
        } else if (x > 0 && y < 0){
            System.out.print("Q4\n");
        }else if(x == 0 && y == 0){
            System.out.print("Origem\n");
        } else if (y == 0) {
            System.out.print("Eixo X\n");
        } else {
            System.out.print("Eixo Y\n");
        }
    }
}