/**
 * Problema: Faça um programa em Java, que poupe recursos de processamento, capaz de descobri rse um numéro real
 * é primo. 
 * @author: Bernardo Nilson
 * @version: 13.04.2023
 */

 import java.util.*;

 public class NumeroPrimo {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        int numero;

        //Recebe as informações do usuário. Após isso, fecha o scanner.
        System.out.println("Este é um programa para calcular se um número é primo! \nInsira um número inteiro: ");
        numero = scan.nextInt();
        scan.close();

        //Verifica se um número é par; eliminando grande parte das possibilidades.
        verificaPar(numero);

        //No caso do número ser "1", ja eliminamos essa chance também.
        if (numero == 1){
            imprimeNaoPrimo();
        }

        //Resolve se o número é primo, de forma genérica.
        int quantDivisores = calculaQuantDivisores(numero);
        if (quantDivisores == 2){
            imprimePrimo();
        } else {
            imprimeNaoPrimo();
        }

        //FIM
    }

    //Verifica, de forma simples, se um número é par. Método.
    public static void verificaPar(int numero){
        if (numero%2==0){
            if (numero == 2){
                imprimePrimo();
            } else {
                imprimeNaoPrimo();
            }
        }
    }

    public static int calculaQuantDivisores (int numero){

        //Contador começa em 1, pois não é possível dividir por 0.   
        int count = 1;
        int quantDivisores = 0;

        /**Enquanto o contador for menor que o número, fica em loop: o contador percorre todos os números antecessores de forma crescente
         * e, assim, calcula a quantidade de divisores */
        while (count <= numero){
            if (numero % count == 0){
                quantDivisores++;
            }
            count++;
        }

        return quantDivisores;
    }

    public static void imprimePrimo (){
        System.out.println("O valor inserido é um número primo!");
        return;
    }
    public static void imprimeNaoPrimo(){
        System.out.println("O valor inserido não é um número primo!");
        return;
    }
 }

