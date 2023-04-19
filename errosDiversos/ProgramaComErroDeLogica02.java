/**
 * Fundamentos de Programa��o - PUCRS
 * Verificando erros de execu��o e/ou compila��o
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */

import java.util.Scanner;
public class ProgramaComErroDeLogica02
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme o ano que voc� nasceu (usando 4 d�gitos. ex: 1990): ");
        int ano = entrada.nextInt();
        entrada.close();
        System.out.println("Voc� tem (ou ter�, nos pr�ximos meses) " + -(ano-2023) +  " anos.");
    }
}
