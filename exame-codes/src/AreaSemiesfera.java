/**
 * Problema: Temos duas pistas de skate. de tamanhos diferentes, que precisam ser pintadas.
 * Calcula a quantidade de latas de tinta necessárias para pintar as duas pistas, sabendo que cada lata
 * cobre 16 m² e são necessárias duas camadas para ficar bom.
 * 
 * @author: Bernardo Nilson
 * @version: 01.04.2023
 * Versão atualizada para receber variáveis do usuário e corrigida a redundância de multiplicar por dois.
 */

 import java.util.Scanner;

 public class AreaSemiesfera {

    public static void main (String [] args){
        
        double raioUm, raioDois, areaUm, areaDois, areaTotal;
        Scanner in = new Scanner(System.in);
        
        //Recebe os valores dos raios das semiesferas.
        System.out.println("Insira o raio da 1º pista, em metros: ");
        raioUm = in.nextDouble();
        
        System.out.println("Insira o raio da 2º pista, em metros: ");
        raioDois = in.nextDouble();

        in.close();

        //Calcula a area de ambas as esferas.
        areaUm = 4*raioUm*Math.pow(Math.PI, 2);
        areaDois = 4*raioDois*Math.pow(Math.PI, 2);
        areaTotal = areaUm + areaDois;

        //Calcula a quantidade de latas de tinta necessárias.
        double lataTinta;
        lataTinta = areaTotal / 16;
        lataTinta = Math.ceil(lataTinta); //Arredonda para cima.

        //Exibe os cálculos ao usuário.
        System.out.println("A quantidade de latas de tinta necessárias foram: " + lataTinta);

        //END
    }
 }