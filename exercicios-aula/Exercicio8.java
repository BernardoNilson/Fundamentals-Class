/**
 * Problema: Faça um programa que escreva a quantidade de números PRIMOS nos primeiros 1000 números naturais.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

 import library.library;
  
  public class Exercicio8{
 
     public static void main (String [] args){

        int quantPrimo = 0;
        int count = 1;

        while (count <= 1000){
            if (library.verificaPrimo(count)){
               quantPrimo++;
               System.out.println(count);
            } 
            count++;
        }

        System.out.println("A quantidade de números primos foi " + quantPrimo);

        //FIM
     }
  }
  