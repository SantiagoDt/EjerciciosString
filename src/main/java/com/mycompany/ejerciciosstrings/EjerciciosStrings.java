/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciosstrings;

/**
 *
 * @author sn.diaz.2022
 */
public class EjerciciosStrings {

    public static void main(String[] args) {

        //Modificamos los espacios en blanco por el caracter "*"
        String s1 = "el río está helado en Febrero";
        String s2 = s1.replace(" ", "*");
        System.out.println(s2);

        // MODIFICAR LOS ESPACIOS EN BLANCO DE UN STRINGBUILDER POR EL CARÁCTER
        StringBuilder s = new StringBuilder("La programación es muy divertida");
        char caracter = ' ';

        for (int i = 0; i < s.length(); i++) {
            caracter = s.charAt(i);
            if (caracter == ' ') {
                s.setCharAt(i, '*');
            }

        }

        System.out.println(s);

        //Queremos saber si un numero es palindromo o no 
        String s3 = "reconocer";

        int longitud = s3.length();

        int ocurrencias = 0;

        for (int i = 0; i < longitud / 2; i++) {

            if (s3.charAt(i) != s3.charAt(s3.length() - 1 - i)) {
                ocurrencias++;
            }

        }

        if (ocurrencias == 0) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        //Queremos saber si un Stringbuilder es palindromo o no
        StringBuilder s4 = new StringBuilder("reconocer");
        String s5 = s4.toString();
        String s6 = s4.reverse().toString();

        if (s5.equals(s6)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        //Eliminar los espacios en blanco de un String
        String s7 = new String("queremos aprobar a toda costa");

        StringBuilder s8 = new StringBuilder(s7);

        for (int i = 0; i < s8.length(); i++) {

            if (s8.charAt(i) == ' ') {
                s8.deleteCharAt(i);
            }

        }

        String resultado = new String(s8);
        System.out.println(resultado);

        //Ejericio 6 
        String s10 = new String("comenzar con un nuevo trabajo es muy dificil");
        String[] array = s10.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Ejercicio 7
        StringBuilder s11 = new StringBuilder("Hola esto es un stringbuilder");
        String[] arrayS = s11.toString().split(" ");

        StringBuilder[] arraySb = new StringBuilder[arrayS.length];

        for (int i = 0; i < arraySb.length; i++) {
            arraySb[i] = new StringBuilder(arrayS[i]);
        }

        //Lo probramos 
        for (int i = 0; i < arraySb.length; i++) {
            System.out.println(arraySb[i]);
        }

        //Ejrcicio 
        String nif = "54869792S";
        
        //El nif tiene que tener 9 caracteres y los primero 8 deben ser numericos

        if (nif.length() == 9 && nif.substring(0, 8).matches("\\d{8}")) {
            
            //El digito final debe ser una letra entre la A-Z nos aseguramos qu sea mayusculo con UpperCase y lo comparamos con matches

            if (nif.toUpperCase().substring(8).matches("[A-Z]")) {
                
                //Finalmente extraemos la parte numerica para imprimirlo por pantalla

                String parteNumerica = nif.substring(0, 8);
                System.out.println("Parte numérica del NIF: " + parteNumerica);

            }else{
                System.out.println("Formato no valido");
            }

           
        }else{
            System.out.println("NIF no valido");
        }
        
        
    }

}
