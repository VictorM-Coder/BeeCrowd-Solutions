package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int cont = 0; cont < n; cont++){
            int dividendo = scanner.nextInt();
            int divisor = scanner.nextInt();

            if (divisor == 0){
                System.out.println("divisao impossivel");
            }else {
                System.out.println((dividendo*1.0)/divisor);
            }
        }
        scanner.close();
    }
}