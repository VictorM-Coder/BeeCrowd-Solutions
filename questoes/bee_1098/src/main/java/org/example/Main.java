package org.example;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        float i = 0, j = 1;
        while(i <= 2.2){
            System.out.println("I=" + decimalFormat.format(i) + " J=" + decimalFormat.format(j+i));
            if (j == 3){
                j = 1;
                i += 0.2;
            }else {
                j++;
            }
        }
    }
}