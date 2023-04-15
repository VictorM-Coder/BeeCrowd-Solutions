package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vertebra, classe, alimentacao;

        vertebra = scanner.nextLine();
        classe = scanner.nextLine();
        alimentacao = scanner.nextLine();

        System.out.println(switchAnimal(vertebra, classe, alimentacao));
    }
    private static String switchAnimal(String vertebra, String classe, String alimentacao){
        if (vertebra.equals("vertebrado")){
            if (classe.equals("ave")){
                return (alimentacao.equals("carnivoro"))?"aguia": "pomba";
            } else {
                return (alimentacao.equals("onivoro"))? "homem": "vaca";
            }
        }else{
            if (classe.equals("inseto")){
                return (alimentacao.equals("hematofago"))?"pulga": "lagarta";
            } else {
                return (alimentacao.equals("hematofago"))? "sanguessuga": "minhoca";
            }
        }
    }
}