package org.example;

public class Reto_1_FIZZ_BUZZ {
    public static void main(String[] args){

        // Resolución 1
        for (int i=1; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }

        //Resolución Optimizada
        for (int i = 1; i <= 100; i++) {
            StringBuilder output = new StringBuilder();

            if (i % 3 == 0) {
                output.append("FIZZ");
            }
            if (i % 5 == 0) {
                output.append("BUZZ");
            }

            if (output.length() == 0) {
                output.append(i);
            }

            System.out.println(output);
        }

    }
}
