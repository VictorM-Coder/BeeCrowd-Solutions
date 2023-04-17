package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEntradas = scanner.nextInt();
        int totalC = 0, totalR = 0, totalS = 0;

        for (int cont = 0; cont < totalEntradas; cont++){
            int valor = scanner.nextInt();
            char animal = scanner.next().charAt(0);
            switch (animal){
                case 'C': totalC += valor; continue;
                case 'R': totalR += valor; continue;
                case 'S': totalS += valor; continue;
            }
        }

        int totalCobaias = totalC + totalR + totalS;
        System.out.printf("Total: %d cobaias\n" +
                "Total de coelhos: %d\n" +
                "Total de ratos: %d\n" +
                "Total de sapos: %d\n" +
                "Percentual de coelhos: %.2f %%\n" +
                "Percentual de ratos: %.2f %%\n" +
                "Percentual de sapos: %.2f %%\n",
                totalCobaias, totalC, totalR, totalS, totalC*100.0/totalCobaias, totalR*100.0/totalCobaias, totalS*100.0/totalCobaias);
        scanner.close();
    }
}