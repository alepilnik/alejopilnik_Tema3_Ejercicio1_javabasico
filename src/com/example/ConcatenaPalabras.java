package com.example;

public class ConcatenaPalabras {

    public static void main(String[] args) {

        String[] palabras = new String[] {"Habia", "Una", "Vez", "OpenBootcamp"};

        String texto = "";

        for (int i = 0; i < palabras.length; i++) {

            texto = texto + palabras[i];

            if (i == 3) {

                break;

            }

            texto = texto + ' ';

        }

        texto = texto + '.';



        System.out.println(texto);



    }

}