/**
 * Problema: Faça um programa que escreva os 10 primeiros números palíndromos.
 * 
 * @author: Bernardo Nilson 
 * @version: 26.04.2023
 */

 import library.library;
  
  public class Exercicio17{
 
     public static void main (String [] args){

        int quantPalindromo = 0;
        int count = 0;

        while (quantPalindromo < 10){
            if (library.verificaPalindromo(count)){
                quantPalindromo++; 
                System.out.println("Número palíndromo: " + count);
            }
            count++;
        }

        System.out.println("A quantidade de números palíndromos foi " + quantPalindromo);

        //FIM
     }
  }
  