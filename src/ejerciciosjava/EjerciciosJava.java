/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Arrays;

/**
 *
 * @author Diego Álvarez
 */
public class EjerciciosJava {

    public int[] maximo(int [] listaNumeros){
               int[] numeroMaximo = {0,0};
               for (int i = 0; i<listaNumeros.length; i++){
               if (numeroMaximo[0] < listaNumeros[i]){
                   numeroMaximo[1] = listaNumeros[i];
                   numeroMaximo[0] = listaNumeros[i];
            }
               else if (numeroMaximo[1]< listaNumeros[i]){
                   numeroMaximo[1] = listaNumeros[i];
               }
        }
               return numeroMaximo;
    }
    public static boolean Palindromo(String palabra){
        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i)!= palabra.charAt(palabra.length()- i - 1)){
                return false;
            }
        }
        return true;
}
    public static boolean Isograma (String Palabra){
        for(int i=0; i < Palabra.length(); i++){
            for(int j=0; j < Palabra.length(); j++){
                if (Palabra.charAt(i) == Palabra.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosJava ejercicio1 = new EjerciciosJava();
        int[] listaNumeros = {50, 31, 27, 2, 5, 99};
        System.out.println(Arrays.toString(ejercicio1.maximo(listaNumeros)));
        String palabra="DABALE	ARROZ	A	LA	ZORRA	EL	ABAD";
        if (Palindromo(palabra)== true){
            System.out.printf("La frase \"%s\"es un palindromo%n", palabra);
        }
        else{
            System.out.printf("La frase \"%s\"no es un palindromo%n", palabra);
        }
        String Palabra="MURCIELAGO";
        if (Isograma(Palabra)== true){
            System.out.printf("La palabra \"%s\"es un isograma%n", Palabra);
        }
        else{
            System.out.printf("La palabra \"%s\"no es un isograma%n", Palabra);
        }
    }
}