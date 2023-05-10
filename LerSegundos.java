/**
 * Problema: Faça um algoritmo que lê o tempo de um evento em segundos e o escreve na tela 
decomposto em horas, minutos e segundos.
 * @author: Bernardo Nilson
 * @version: 25.03.2023
 */

 import java.util.*;

 public class LerSegundos {

    public static void main (String [] args){

        int segundos, minutos, horas;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o tempo que seja calcular, em segundos: ");

        in.close();

        segundos = in.nextInt();
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println("Resultado calculado: " + horas + " hora (s), " + minutos + " minuto (s) e " + segundos + " segundo (s)");
    }
 }
