/**
 * Fundamentos de Programa��o - PUCRS
 * Verificando erros de execu��o e/ou compila��o
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */

import java.util.Scanner;
public class ProgramaComErroDeExecucao02
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor inteiro: ");
        double valor1 = entrada.nextInt();
        entrada.close();
        double valor2 = 10;
        System.out.println("\fResultado 1: " + (valor2/valor1));
        System.out.println("Resultado 2: " + (valor1/valor2));
        System.out.println("Legal, mais um programa que executa corretamente !");
    }
}
