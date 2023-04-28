/**
 * Problema: Faça um programa que leia X valores reais e interrompa a leitura quando o número for negativo.
 * Ao final, escreva quantos são pares, ímpares e negativos. Lembre-se que o valor deve ser natural para verificar se é par, por exemplo.
 * 
 * @author: Bernardo Nilson 
 * @version: 26.04.2023
 */

import java.util.Scanner;
import biblioteca.Biblioteca;
 
 public class Exercicio15{

    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);

        int quantPar = 0;
        int quantImpar = 0;
        int count = 0;
        double num;
        
        System.out.println("Saudações! Este programa pode receber qualquer valor REAL, porém, interrompe se for negativo.\n");

        do {
            System.out.println("Digite um número REAL: ");
            num = scan.nextDouble();
            if (Biblioteca.verificaNatural(num)){
                if (Biblioteca.verificaPar(num)) quantPar++;
                 else quantImpar++;
            }
            count++;
        } while (num >= 0);

        scan.close();

        System.out.println("A quantidade de números lidos foi " + count + "\nA quantidade de números pares foi " + quantPar + "\nA quantidade de números ímpares foi " + quantImpar + "\nA quantidade de números negativos foi 1");
    }
 }
 