package org.example;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntPares = 0, qntPositivos = 0, qntNegativos = 0;

        for (int cont = 1; cont <= 5; cont++){
            float valor = scanner.nextFloat();
            qntPares += (valor%2==0)?1:0;
            qntPositivos += (valor>0)?1:0;
            qntNegativos += (valor<0)?1:0;
        }
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", qntPares, 5-qntPares, qntPositivos, qntNegativos);
        scanner.close();
    }
}