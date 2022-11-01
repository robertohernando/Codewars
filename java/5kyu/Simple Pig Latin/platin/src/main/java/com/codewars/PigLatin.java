package com.codewars;


public class PigLatin {
    public static void main(String[] args) {
        pigIt("t...ora o mores ![]");
    }

    /*Mi solución */
    public static String pigIt(String str) {
        // Divido la cadena en palabras
        String palabras[] = str.split(" ");
        String pig = "";
        for (String palabra : palabras) {
            // Para cada palabra, si no comienza por un signo de puntuación, muevo la última letra al final y añado ay
            if (palabra.substring(0, 1).matches("[a-zA-Z]")) {
                palabra = palabra.substring(1) + palabra.substring(0, 1) + "ay";
            }
            pig += palabra + " ";
        }
        return(pig.trim());
    }


    /*La mejor solución de codewars */
    public static String pigIt2(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

}
