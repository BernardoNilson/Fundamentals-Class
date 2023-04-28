/**
 * Problema: Faça um programa que leia um conjunto de 10 números NATURAIS, 1 a 1, verifique qual é o maior e se ele é
 * primo, ao final, diga quantos são PRIMOS.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

 
import java.util.Scanner;
import biblioteca.Biblioteca;
  
  public class Exercicio7{
 
     public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        int num;
        int aux = 0;
        int quantPrimo = 0;

        System.out.println("Saudações! Este programa recebe apenas entradas NATURAIS: ");
        for (int count = 1; count <= 10; count++){
            //Garante que a entrada seja natural
            do {
                System.out.println("Digite um número NATURAL: ");
                num = scan.nextInt();
            } while (num < 0);

            if (Biblioteca.verificaPrimo(num)) quantPrimo++;
            if (num > aux) aux = num;
        }

        scan.close();

        if (Biblioteca.verificaPrimo(aux)) System.out.println("O maior número lido é primo: " + aux);
         else System.out.println("O maior número lido não é primo: " + aux);
        
        System.out.println("A quantidade de números primos lidos, no total, é " + quantPrimo);
        //FIM
     }
  }
  