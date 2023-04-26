/**
 * Problema: Faça um código que leia valores de 1 a 1, sendo estes NATURAIS. O programar deve parar quando a soma destes valores
 * for maior que (1º valor X 500).
 * 
 * @author: Bernardo Nilson 
 * @version: 26.04.2023
 */

 import java.util.Scanner;

 public class Exercicio14{

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);  

        int numUm;

        System.out.println("Saudações! Enquanto não inserir uma entrada NATURAl, o programa não prossegue.\n");
        
        do{
        System.out.println("Digite um valor NATURAL: ");
        numUm = scan.nextInt();
        } while (numUm < 0);
        
        int num = 0;
        int soma = numUm;    

        while ((soma < (numUm*500))){
            do {
                System.out.println("Digite um valor NATURAL: ");
                num = scan.nextInt();
                soma += num;
            } while (num < 0);
        }

        scan.close();
        System.out.println("\nFim do programa!");
    }
 }
 