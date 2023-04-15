package org.example;

import java.util.Scanner;

public class Main {
    static int somarIntervalo(int menor, int maior){
        menor += (menor%2==0)? 1:2;
        int soma = 0;
        while (menor < maior) {
            soma += menor;
            menor+=2;
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println(somarIntervalo(num2, num1));
        }else {
            System.out.println(somarIntervalo(num1, num2));
        }
        scanner.close();
    }
}