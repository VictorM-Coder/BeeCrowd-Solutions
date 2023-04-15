package org.example;

public class Main {
    public static void main(String[] args) {
        for (int j = 60, i = 1; j >= 0; j-=5, i+=3){
            System.out.printf("I=%d J=%d\n", i,j);
        }
    }
}