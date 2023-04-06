package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicio, horaFinal, minutoInicio, minutoFinal, duracaoHoras, duracaoMinutos;
        horaInicio = scanner.nextInt();
        minutoInicio = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();

        duracaoMinutos = 1440 - (horaInicio*60 + minutoInicio)  + horaFinal*60 + minutoFinal;
        duracaoMinutos = (duracaoMinutos > 1440)? duracaoMinutos-1440: duracaoMinutos;

        duracaoHoras = (duracaoMinutos >= 60)? duracaoMinutos/60: 0;
        duracaoMinutos = duracaoMinutos - (duracaoHoras*60);
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);
    }
}