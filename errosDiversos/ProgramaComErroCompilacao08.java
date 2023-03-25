/**
 * Fundamentos de Programação - PUCRS
 * Verificando erros de execução e/ou compilação
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */

import java.util.Scanner;
public class ProgramaComErroCompilacao08
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme um valor inteiro: ");
        int valor = entrada.nextInt();
        System.out.println("Você digitou o número inteiro: " + valor);
    }
}
