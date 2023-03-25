/**
 * Fundamentos de Programação - PUCRS
 * Verificando erros de execução e/ou compilação
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */

import java.util.Scanner;
public class ProgramaComErroDeExecucao04
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme o primeiro valor inteiro: ");
        double valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
        double valor2 = entrada.nextInt();

        System.out.println("Resultado 1: " + (valor1/valor2));
        System.out.println("Resultado 2: " + (valor2/valor1));
        System.out.println("Legal, mas um programa sem erros!!!");
    }
}