/**
 * Problema: Faça um programa que escreva os 10 primeiros números PERFEITOS.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

 import library.library;
  
  public class Exercicio11{
 
     public static void main (String [] args){

        int quantPerfeito = 0;
        int count = 1;

        while (quantPerfeito <= 10){
            if (library.verificaPerfeito(count)){
               quantPerfeito++;
               System.out.println(count);
            } 
            count++;
        }

        System.out.println("A quantidade de números perfeitos foi " + quantPerfeito);

        //FIM
     }
  }
  