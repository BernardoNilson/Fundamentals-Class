/**
 * Fundamentos de Programação - PUCRS
 * Verificando erros de execução e/ou compilação
 * 
 * @author Giraffa adaptado de Profa. Silvia Moraes
 * @author Bernardo Nilson
 * @version 24.03.2023
 */
import java.util.Scanner;

public class ProgramaComErroDeLogica05
{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\fInforme o primeiro valor inteiro: ");
        double valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor inteiro: ");
        double valor2 = entrada.nextInt();
        double media = (valor1 + valor2) / 2;
        System.out.println("Média Aritmética: " + media);
    }

}
