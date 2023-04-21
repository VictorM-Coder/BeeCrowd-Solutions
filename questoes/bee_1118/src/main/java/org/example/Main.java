package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas =  new float[2];
        int cont = 0;

        while (cont < 2) {
            float valor =  scanner.nextFloat();
            if (valor < 0 || valor > 10) {
                System.out.println("nota invalida");
            } else {
                notas[cont] = valor;
                cont++;
            }

            if (cont == 2){
                System.out.printf("media = %.2f\n", (notas[0]+notas[1])/2);
                while (true){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    int resposta = scanner.nextInt();
                    if (resposta == 1){
                        cont = 0;
                        break;
                    }else if (resposta == 2){
                        break;
                    }
                }
            }
        }

    }
}