package org.example;

import java.util.Scanner;

public class Main {
    static int somarImpares(int menor, int maior){
        int soma = 0;
        menor += (menor%2==0)? 1: 2;
        for (int cont = menor; cont < maior; cont+=2){
            soma += cont;
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();

        for (int cont = 0; cont < n; cont++){
            int valor1 = scanner.nextInt();
            int valor2 = scanner.nextInt();

            if (valor1 > valor2){
                System.out.println(somarImpares(valor2, valor1));
            }else{
                System.out.println(somarImpares(valor1, valor2));
            }
        }

        scanner.close();
    }
}