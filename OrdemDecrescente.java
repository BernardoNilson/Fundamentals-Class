/**
 * Problema: Faça um algoritmo que lê obrigatoriamente três números diferentes do usuário e calcula a ordem decrescente dos números.
 * @author: Bernardo Nilson
 * @version: 18.04.2023
 */

 import java.util.*;

 public class OrdemDecrescente {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        double valorA, valorB, valorC;

        //loop de repetição para garantir que a entrada seja de números diferentes.
        do{
        System.out.println("Este é um programa que organiza os valores DIFERENTES em ordem decrescente.\nInsira o 1º número: ");
        valorA = scan.nextInt();

        System.out.println("Insira o 2º número: ");
        valorB = scan.nextInt();

        System.out.println("Insira o 3º número: ");
        valorC = scan.nextInt();
        }while((valorA==valorB)||(valorA==valorC)||(valorB==valorC));

        //Apenas fecha o Scanner.
        scan.close();

        //Método responsável por organizar os números.
        organizaDecrescente(valorA, valorB, valorC);
        
        System.out.println("Fim do programa!");
    }

    public static void organizaDecrescente (double valorA, double valorB, double valorC){

        //Utiliza da lógica de uma variável auxiliar para descobrir a posição de cada número. 
        double maior = valorA; //Valor aleatório para começar os testes
        if (valorB > maior) maior = valorB; //Caso B seja maior, substitui a variável e testa novamente.
        if (valorC > maior) maior = valorC; //Caso C seja maior, substitui também. 

        double menor = valorA; //Valor aleatório para começar os testes
        if (valorB < menor) menor = valorB; //Caso B seja menor, atribui o valor de B na variável.
        if (valorC < menor) menor = valorC; //Caso C seja o menor, atribui por cima.

        double meio = valorA; //Valor aleatório para começar os testes
        if ((valorB < maior)&&(valorB > menor)) meio = valorB; //Caso B esteja entre o dois números, substitui o valor de "meio".
        if ((valorC < maior)&&(valorC > menor)) meio = valorC; //Mesma lógica do B.

        System.out.println("A ordem ficou: " + maior + ", " + meio + " e " + menor);
        //FIM
    }
 }