package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pedido1, quantidade;
        pedido1 = scanner.nextInt();
        quantidade = scanner.nextInt();

        System.out.printf("Total: R$ %.2f\n", calcularPreco(pedido1)*quantidade);
    }

    private static float calcularPreco(int codigo){
        return switch (codigo) {
            case 1 -> 4f;
            case 2 -> 4.5f;
            case 3 -> 5f;
            case 4 -> 2f;
            case 5 -> 1.5f;
            default -> 0;
        };
    }
}