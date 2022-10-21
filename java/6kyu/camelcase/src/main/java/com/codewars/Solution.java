package com.codewars;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        System.out.println(toCamelCase("hola_cara-cola_"));
        System.out.println(toCamelCase2("hola_cara-cola_"));
        System.out.println(toCamelCase3("hola_cara-cola_"));
    }

    //Mi solución
    static String toCamelCase(String s){
        StringBuilder sol = new StringBuilder();
        try {
            for (int x=0; x<s.length(); x++) {
                if (s.charAt(x) == '_'  || s.charAt(x) == '-' ) {
                    sol.append(Character.toUpperCase(s.charAt(++x)));
                } else {
                    sol.append(s.charAt(x));
                }
            }
        } catch (Exception e) {
            //Me he pasado del índice
        }

        return sol.toString();
      }    

      //Solución con expresiones regulares
      static String toCamelCase2(String s) {
        Matcher m = Pattern.compile("[-|_](\\w)").matcher(s);
        StringBuffer sol = new StringBuffer();

        while (m.find()) {
            m.appendReplacement(sol, m.group(1).toUpperCase());
        }

        return m.appendTail(sol).toString();
      }

      //Solución con split y mapReduce (funciones Lambda)
      static String toCamelCase3(String cadena) {
        String[] palabras = cadena.split("[-_]");

        return Arrays.stream(palabras, 1, palabras.length)
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .reduce(palabras[0], String::concat);
      }
}
