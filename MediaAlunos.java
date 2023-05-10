/**
 * Problema: Faça um algoritmo que lê as 3 notas de um aluno, calcula e escreve a média final deste 
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, 
respectivamente. 
 * @author: Bernardo Nilson
 * @version: 25.03.2023
 */

 import java.util.Scanner;

 public class MediaAlunos{

    public static void main (String [] args){

        double notaUm, notaDois, notaTres, result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a 1º nota do aluno: ");
        notaUm = scan.nextInt();

        System.out.println("Insira a 2º nota do aluno: ");
        notaDois = scan.nextInt();

        System.out.println("Insira a 3º nota do aluno: ");
        notaTres = scan.nextInt();

        scan.close();
        
        result = (notaUm*2 + notaDois*3 + notaTres*5)/10;

        System.out.println("Média calculada: " + result);
    }
 }
