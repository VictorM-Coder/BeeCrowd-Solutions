package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ddd = scanner.nextInt();

        System.out.println(selectDDD(ddd));
    }

    static String selectDDD(int ddd){
        switch (ddd){
            case 61: return "Brasilia";
            case 71: return "Salvador";
            case 11: return "Sao Paulo";
            case 21: return "Rio de Janeiro";
            case 32: return "Juiz de Fora";
            case 19: return "Campinas";
            case 27: return "Vitoria";
            case 31: return "Belo Horizonte";
            default: return "DDD nao cadastrado";
        }
    }
}