/**
 * Fundamentos de Programa��o - PUCRS
 * Verificando erros de execu��o e/ou compila��o
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */

import java.util.Scanner;
public class ProgramaComErroCompilacao07
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme um valor inteiro: ");
        int valor = entrada.nextInt();
        entrada.close();
        System.out.println("Voc� digitou o n�mero inteiro:"  + valor);
        
    }
}
