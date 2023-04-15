package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntTitas, tamanhoMuralha, p, m, g;
        qntTitas = scanner.nextInt();
        tamanhoMuralha = scanner.nextInt();
        scanner.nextLine();
        char[] ordemTitas = new char[qntTitas];
        int[] maxMuralhas = new int[qntTitas];

        String value = (scanner.nextLine());
        ordemTitas = value.toCharArray();

        p = scanner.nextInt();
        m = scanner.nextInt();
        g = scanner.nextInt();

        for (int cont = 0; cont < qntTitas; cont++) maxMuralhas[cont] = tamanhoMuralha;

        for (int cont = 0; cont < qntTitas; cont++){
            for (int cont1 = 0; cont1 < qntTitas; cont1++){
                if (ordemTitas[cont] == 'P'){
                    if (p <= maxMuralhas[cont1]){
                        maxMuralhas[cont1] -= p;
                        break;
                    }else {
                        continue;
                    }
                }else if (ordemTitas[cont] == 'M'){
                    if (m <= maxMuralhas[cont1]){
                        maxMuralhas[cont1] -= m;
                        break;
                    }else {
                        continue;
                    }

                }else{
                    if (g <= maxMuralhas[cont1]){
                        maxMuralhas[cont1] -= g;
                        break;
                    }else {
                        continue;
                    }
                }
            }
        }

        int tot = 0;
        for (int cont = 0; cont < qntTitas; cont++) {
            if (maxMuralhas[cont] < tamanhoMuralha) tot++;
        }

        System.out.println(tot);
    }
}