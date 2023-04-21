package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int golsInter, golsGremio, totGrenais = 0, vitoriasInter = 0, vitoriasGremio = 0;
        while (true){
            golsInter = scanner.nextInt();
            golsGremio = scanner.nextInt();

            if (golsInter > golsGremio) vitoriasInter++;
            else if (golsGremio > golsInter) vitoriasGremio++;
            totGrenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int resposta = scanner.nextInt();
            if (resposta == 2) break;
        }

        System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n", totGrenais, vitoriasInter, vitoriasGremio, totGrenais-vitoriasGremio-vitoriasInter);
        if (vitoriasInter >  vitoriasGremio){
            System.out.println("Inter venceu mais");
        }else if (vitoriasGremio > vitoriasInter){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
        scanner.close();
    }
}