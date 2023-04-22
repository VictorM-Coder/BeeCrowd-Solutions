package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        int maior, menor, soma=0;
        if (valor1 > valor2){
            maior = valor1;
            menor = valor2;
        }else{
            maior = valor2;
            menor = valor1;
        }

        for (int cont = menor; cont <= maior; cont++){
            if (cont%13!=0){
                soma += cont;
            }
        }
        System.out.println(soma);
        scanner.close();
    }
}