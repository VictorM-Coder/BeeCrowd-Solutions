package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 1, j = 7;
        while (i != 11 || j != 7){
            System.out.printf("I=%d J=%d\n", i, j);
            if(j == 5){
                i += 2;
                j = 7;
                continue;
            }
            j--;
        }
    }
}