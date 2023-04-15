package org.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int diaInicio, diaFinal, totalDias, totalHoras, totalMinutos;
        int[] horaInicio = new int[3];
        int[] horaFinal = new int[3];

        String stringDiaInicio = scanner.nextLine();
        diaInicio = Integer.parseInt(stringDiaInicio.split(" ")[1]);
        scanArray(horaInicio);

        String stringDiaFinal = scanner.nextLine();
        diaFinal = Integer.parseInt(stringDiaFinal.split(" ")[1]);
        scanArray(horaFinal);

        int diferencaEmSegundos = (converterParaSegundos(diaFinal, horaFinal) - converterParaSegundos(diaInicio, horaInicio));

        totalDias = diferencaEmSegundos/86400;
        diferencaEmSegundos -= totalDias*86400;
        totalHoras = diferencaEmSegundos/3600;
        diferencaEmSegundos -= totalHoras*3600;
        totalMinutos = diferencaEmSegundos/60;
        diferencaEmSegundos -= totalMinutos*60;

        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n", totalDias, totalHoras, totalMinutos, diferencaEmSegundos);
        scanner.close();
    }
    static int converterParaSegundos(int dia, int[] hora){
        return ((dia-1)*86400) + ((hora[0]-1)*3600) + (hora[1]-1)*60 + (hora[2]);
    }

    static void scanArray(int [] array){
        String[] stringArray = (scanner.nextLine()).split(" : ");
        for (int cont = 0; cont < 3; cont++){
            array[cont] = Integer.parseInt(stringArray[cont]);
        }
    }
}