/**
 * Fundamentos de Programa��o - PUCRS
 * Verificando erros de execu��o e/ou compila��o
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */

import java.util.Scanner;
public class ProgramaComErroDeLogica07
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double valor1 = 0;
        double valor2 = 0;
        System.out.println("\fInforme o primeiro valor inteiro: ");
        valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
        valor2 = entrada.nextInt();
        entrada.close();
        double media = (valor1 + valor2) / 2;
        
        System.out.println("Média Aritm�tica: " + media);
    }

}
