package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String positiveOrNegative, evenOrOdd;

        for (int cont = 1; cont <= num; cont++){
            int valor = scanner.nextInt();
            if (valor == 0){
                System.out.println("NULL");
            }else {
                positiveOrNegative = (valor>0)?"POSITIVE" : "NEGATIVE";
                evenOrOdd = (valor%2==0)? "EVEN": "ODD";
                System.out.println(evenOrOdd + " " + positiveOrNegative);
            }

        }
        scanner.close();
    }
}