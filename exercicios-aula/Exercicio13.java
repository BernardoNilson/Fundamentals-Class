/**
 * Problema: Faça um programa que conte quantos números AMIGOS exitem entre 100 e 10000.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

 import biblioteca.Biblioteca;
  
  public class Exercicio13{
 
     public static void main (String [] args){

        int quantAmigos = 0;

        for (int count = 100; count <= 10000; count++){
            for (int countDois = count + 1; countDois <= 10000; countDois++){ //Com o  objetivo de otimizar e evitar a contagem dupla, começa a varredura a partir do ponto que o loop anterior parou.
                if (Biblioteca.verificaAmigo(count, countDois)&&(count!=countDois)){ //A segunda espressão evite que inclua números perfeitos na contagem.
                    quantAmigos++;
                    System.out.println(count + " " + countDois); 
                }
                if (countDois == 2*count) break; //Evita a varredura completa (e desnecessária) no loop de repetição
            }
        }
        
        System.out.println("A quantidade de números amigos foi " + quantAmigos);

        //FIM
     }
  }
  