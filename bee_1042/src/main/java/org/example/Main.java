package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[3];
        int[] listaOrdenada;

        for (int cont = 0; cont < 3; cont++) {
            lista[cont] = scanner.nextInt();
        }

        listaOrdenada = lista.clone();
        for (int cont = 0; cont < 3; cont++){
            for (int cont2 = cont+1; cont2 < 3; cont2++){
                if (listaOrdenada[cont] > listaOrdenada[cont2]){
                    int temp = listaOrdenada[cont];
                    listaOrdenada[cont] = listaOrdenada[cont2];
                    listaOrdenada[cont2] = temp;
                }
            }
        }

        Arrays.stream(listaOrdenada).forEach(System.out::println);
        Arrays.stream(lista).forEach(System.out::println);
    }
}