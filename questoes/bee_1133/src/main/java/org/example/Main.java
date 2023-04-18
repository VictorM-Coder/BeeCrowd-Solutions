package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ent1, ent2, min, max;
        ent1 = scanner.nextInt();
        ent2 = scanner.nextInt();
        min = Math.min(ent2, ent1);
        max = Math.max(ent2, ent1);

        for (int cont = min+1; cont < max; cont++){
            int resto = cont%5;
            if (resto == 2 || resto == 3) System.out.println(cont);
        }
        scanner.close();
    }
}