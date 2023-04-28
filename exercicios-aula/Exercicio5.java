
/**
 * Problema: Faça um programa que leia o dia e o mes de aniversário de 12 pessoas, 1 a 1, e informa
 * se a pessoa já fez aniversário, está fazendo hoje ou irá fazer este ano.
 * Ao final, escreva qunatas pessoas fizeram aniversário hoje.
 * 
 * @author: Bernardo Nilson 
 * @version: 27.04.2023
 */

import java.util.Scanner;
import biblioteca.Biblioteca;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int diaAniversario, mesAniversario;
        System.out.println("Saudações! Este programa verifica a data de aniversário. Por favor, insira uma data válida.\n");

        System.out.println("Antes, digite o dia de hoje: ");
        int diaHoje = scan.nextInt();
        System.out.println("Agora, o mês de hoje: ");
        int mesHoje = scan.nextInt();
        System.out.println("Por fim, o ano atual: ");
        int anoHoje = scan.nextInt();

        int quantAniversarioHoje = 0;

        for (int count = 1; count <= 12; count++){
            System.out.println("\nPor favor, digite o dia do seu aniversário: ");
            diaAniversario = scan.nextInt();
            System.out.println("Digite o mês do seu aniversário: ");
            mesAniversario = scan.nextInt();

            Biblioteca.verificaAniversario(diaAniversario, mesAniversario, diaHoje, mesHoje, anoHoje);

            if ((mesAniversario==mesHoje)&&(diaAniversario==diaHoje)) quantAniversarioHoje++;
        }

        scan.close();

        System.out.println("\nPor fim, " + quantAniversarioHoje + " pessoa (s) faz (em) aniversário hoje.");

        // FIM
    }
}
