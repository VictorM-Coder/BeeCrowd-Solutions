package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1, n2, n3, n4;

        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();
        n4 = scanner.nextFloat();

        float media = (n1*2 + n2*3 + n3*4 + n4)/10;

        System.out.printf("Media: %.1f\n", media);
        if (media>= 7){
            System.out.println("Aluno aprovado.");
        }else if (media < 5){
            System.out.println("Aluno reprovado.");
        }else {
            System.out.println("Aluno em exame.");
            float notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);

            float novaMedia = (notaExame+media)/2;
            if (novaMedia>= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", novaMedia);
        }
    }
}