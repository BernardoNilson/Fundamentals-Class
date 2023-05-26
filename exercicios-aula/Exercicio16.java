/**
 * Problema: Faça um programa que conte quantos números PALÍNDROMOS existem nos
 * primeiros 2000 naturais.
 * 
 * @author: Bernardo Nilson 
 * @version: 26.04.2023
 */

 import library.library;
  
  public class Exercicio16{
 
     public static void main (String [] args){

        int quantPalindromo = 0;

        for (int count = 0; count < 2000; count++){
            if (library.verificaPalindromo(count)) quantPalindromo++;
        }

        System.out.println("A quantidade de números palíndromos foi " + quantPalindromo);

        //FIM
     }
  }
  