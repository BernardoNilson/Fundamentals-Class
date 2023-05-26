
/**
 * Problema: Faça um programa que leia um conjunto de 10 números NATURAIS, 1 a 1, ao final, diga quantos são PRIMOS.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

import java.util.Scanner;

import library.library;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int quantPrimo = 0;

        System.out.println("Saudações! Este programa recebe apenas entradas NATURAIS: ");

        for (int count = 1; count <= 10; count++) {
            // Garante que a entrada seja natural
            do {
                System.out.println("Digite um número NATURAL: ");
                num = scan.nextInt();
            } while (num < 0);

            if (library.verificaPrimo(num))
                quantPrimo++;
        }

        scan.close();

        System.out.println("A quantidade de números primos lidos, no total, é " + quantPrimo);
        // FIM
    }
}
