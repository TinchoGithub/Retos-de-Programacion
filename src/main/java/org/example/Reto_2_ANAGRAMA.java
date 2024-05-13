package org.example;

import java.util.Arrays;

public class Reto_2_ANAGRAMA {
    public static void main(String[] args){

        String palabra_1 = "Developer";
        String palabra_2 = "DEVELOPER";
        System.out.println(esAnagrama(palabra_1, palabra_2));

    }

    //COMPARA LAS DOS LISTAS DE CARACTERES
    public static boolean esAnagrama(String palabra_1, String palanra_2){
        char[] lista_1 = crearLista(palabra_1);
        char[] lista_2 = crearLista(palanra_2);

        if (Arrays.equals(lista_1, lista_2)){
            System.out.println("Es Anagrama");
            return true;
        }else{
            System.out.println("NO es Anagrama");
            return false;
        }
    }

    // CREA UNA LISTA DE CARACTERES CON LA PALABRA RECIBIDA POR PARÁMETRO, LA ORDENA Y RETORNA.
    public static char[] crearLista(String palabra){

        char[] lista = (palabra.toLowerCase()).toCharArray();
        Arrays.sort(lista);
        return lista;
    }
}
