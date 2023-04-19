package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 1, j = 6;
        while ((j + i) <= 15){
            System.out.printf("I=%d J=%d\n", i, j+i);
            if (j < 5){
                j = 6;
                i += 2;
            }else {
                j--;
            }
        }
    }
}