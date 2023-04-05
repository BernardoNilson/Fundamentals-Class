/**
 * Problema: Faça um progrma que receba doios horários, referentes ao início e fim de uma partida de tênis.
 * Depois disso, exiba as durações das partidas e o valor a ser pago pelo aluguel da quadra (R$90 por hora).
 * Lembre-se que é sempre cobrado a hora cheia, sendo necessário arredondar para cima.
 * 
 * @author: Bernardo Nilson
 * @version: 31.03.2023
 * 
 */

 import java.util.Scanner;

 public class DuracaoPartida {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        //Nessa parte, apenas declaro as principais variáveis e exibimos ao usuário.
        int horaInicial, minInicial, horaFinal, minFinal;
        System.out.println("Insira a hora inicial da partida: ");
        horaInicial = in.nextInt();
        
        System.out.println("Insira o minuto inicial da partida: ");
        minInicial = in.nextInt();

        System.out.println("Insira a hora final da partida: ");
        horaFinal = in.nextInt();

        System.out.println("Insira o minuto final da partida: ");
        minFinal = in.nextInt();

        //Agora, calculo a duração da partida, usando novas variáveis.
        int resultadoHora, resultadoMin;
        resultadoHora = horaFinal - horaInicial;
        resultadoMin = minFinal - minInicial;

        //Se, por acaso, a partida demorar mais que um dia, não tem erro.
        if (resultadoHora < 0){
            resultadoHora += 24;
        }

        //Se partida demorar menos de uma hora, evita número negativo.
        if (resultadoMin < 0){
            resultadoMin += 60;
            resultadoHora--;
        }
        
        //Calcular o valor a ser pago.
        int valorPago = 0;
        //Conforme o enunciado, arrendonda-se sempre para cima. 
        if (resultadoMin != 0){
            valorPago = 90;
        }
        valorPago = valorPago + resultadoHora*90;

        //Nesssa parte, vamos exibir todos as nossas expressões:
        System.out.println("A duração da partida foi " + resultadoHora + " horas e " + resultadoMin + " minutos");
        System.out.println("O valor total do aluguel das quadras ficou em R$" + valorPago);

        //END
    }
 }