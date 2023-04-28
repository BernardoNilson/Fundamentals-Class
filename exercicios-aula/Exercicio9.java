/**
 * Problema: Faça um programa que escreva os 10 primeiros números PRIMOS.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

 import biblioteca.Biblioteca;
  
  public class Exercicio9{
 
     public static void main (String [] args){

        int quantPrimo = 0;
        int count = 1;

        while (quantPrimo < 100){
            if (Biblioteca.verificaPrimo(count)){
               quantPrimo++;
               System.out.println(count);
            } 
            count++;
        }

        System.out.println("A quantidade de números primos foi " + quantPrimo);

        //FIM
     }
  }
  