package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int in = 0, out = 0;
        for (int cont = 0; cont < num; cont++){
            int valor = scanner.nextInt();
            if (valor <= 20 && valor >= 10) in++;
            else out++;
        }
        System.out.printf("%d in\n%d out\n", in, out);

        scanner.close();
    }
}