
/**
 * Problema: Faça um programa que receba 15 números, lidos de 3 em 3, e verifique se cada conjunto os números são diferentes.
 * Após a condução se verificar, escreva-os em ordem decrescente. Ao final, imprima o maior valor lido.
 * 
 * @author: Bernardo Nilson 
 * @version: 28.04.2023
 */

import java.util.Scanner;
import biblioteca.Biblioteca;

public class Exercicio1{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Saudações! Para cada conjunto de entradas, somente são aceitas entradas diferentes.");

        double numA, numB, numC;
        double aux = 0;

        for (int count = 1; count <= 5; count++){
            //Garante que a entrada seja diferente.
            do {
                System.out.println("\nDigite um número: ");
                numA = scan.nextDouble();
                System.out.println("Digite um número: ");
                numB = scan.nextDouble();
                System.out.println("Digite um número: ");
                numC = scan.nextDouble();
            } while ((numA==numB)||(numA==numC)||(numB==numC));

            //Imprime os números em ordem decrescente.
            Biblioteca.imprimeDecrescente(numA, numB, numC);

            //Verifica, em todas as leituras, qual foi o maior número lido.
            if (numA > aux) aux = numA;
            if (numB > aux) aux = numB;
            if (numC > aux) aux = numC;
        }

        scan.close();

        System.out.println("\nO maior número lido foi " + aux);
        // FIM
    }
}
