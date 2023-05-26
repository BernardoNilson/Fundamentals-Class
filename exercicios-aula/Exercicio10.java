/**
 * Problema: Faça um programa que escreva a quantidade de números PERFEITOS até 1000
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

 import library.library;
  
  public class Exercicio10{
 
     public static void main (String [] args){

        int quantPerfeito = 0;
        int count = 1;

        while (count <= 1000){
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
  