package org.example;

public class Reto_3_FIBONACCI {
    public static void main (String[] args){

        // Se inicializan las variables con los primeros dos números de la sucesión de Fibonacci
        int a = 0;
        int b = 1;
        System.out.println(a);

        while (b <= 50) {
            System.out.println(b);
            int temporal = a + b; // Se calcula siguiente número de la sucesión
            a = b;
            b = temporal; // Se actualizan las variables para el próximo número de sucesión
        }
    }
}
