/**
 * Problema: Faça um programa que receba a data de aniversário e o dia atual do usuário, manualmente;
 * Com isso, mostre o signo deste usuário. Além, se hoje for o aniversário dele, dê parabéns; se já passou, mostra a sua idade e quantos dias desde o aniversário;
 * se ainda não chegou, mostre quantos dias faltam.
 * 
 * @author: Bernardo Nilson, Bruno Neves, Gabriel X, Fellipe X e José X
 * @version: 05.04.2023
 * Descrição: 1º versão, ideia inicial
 */

 import java.util.*;

 public class ProgramaAniversario {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        int diaNascimento, mesNascimento, anoNascimento, diaHoje, mesHoje, anoHoje;

        //Aqui, vamos apenas receber as variáveis do usuário.
        System.out.println("Insira o dia do seu nascimento: ");
        diaNascimento = in.nextInt();

        System.out.println("Insira o mês do seu nascimento: ");
        mesNascimento = in.nextInt();

        System.out.println("Insira o ano do seu nascimento: ");
        anoNascimento = in.nextInt();

        System.out.println("Insira o dia de hoje: ");
        diaHoje = in.nextInt();

        System.out.println("Insira o mês de hoje: ");
        mesHoje = in.nextInt();
        
        System.out.println("Insira o ano de hoje: ");
        anoHoje = in.nextInt();
        
        //Por meio de um método, recebe o signo da pessoa.
        String signo = obterSigno(mesNascimento, diaNascimento);
        System.out.println(signo + " Teste1");

        //Por meio deste método, verifica se hoje é o aniversário.
            //A SER ELABORADO       

        //Por meio deste método, verifica se o aniversário já passou e indica a idade.
            //A SER ELABORADO

        //Por meio deste método, verifica se o aniversário ainda não passou e indica quantos dias faltam.
            //A SER ELABORADO

    }

    //Com o objetivo de deixar o código mais legível e limpo, criamos um método para obter o signo.
    public static String obterSigno(int mesNascimento, int diaNascimento){
        //Definimos signo como um espaço vazio porque o programa não sabe lidar com a variável não declarada.
        String signo = " ";

        /**
         * Como funciona? O Switch Case usa um sistema de simulação:
         * Pega uma variável específica (ou operação lógica) e compara com cada caso.
         * Se for certo caso, fará determinada coisa.
         */
        switch (mesNascimento){
            case 1:
                if(diaNascimento <= 20){
                    signo = "Capricórnio";
                } else {
                    signo = "Aquário";
                }
                break;
            case 2:
                if(diaNascimento <= 18){
                    signo = "Aquário";
                } else {
                    signo = "Peixes";
                }
                break;
            case 3:
                if(diaNascimento <= 20){
                    signo = "Peixes";
                } else {
                    signo = "Áries";
                }
                break;
            case 4:
                if(diaNascimento <= 20){
                    signo = "Áries";
                } else {
                    signo = "Touro";
                }
                break;
            case 5:
                if(diaNascimento <= 20){
                    signo = "Touro";
                } else {
                    signo = "Gêmeos";
                }
                break;
            case 6:
                if(diaNascimento <= 20){
                    signo = "Gêmeos";
                } else {
                    signo = "Câncer";
                }
                break;
            case 7:
                if(diaNascimento <= 22){
                    signo = "Câncer";
                } else {
                    signo = "Leão";
                }
                break;
            case 8:
                if(diaNascimento <= 22){
                    signo = "Leão";
                } else {
                    signo = "Virgem";
                }
                break;
            case 9:
                if(diaNascimento <= 22){
                    signo = "Virgem";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if(diaNascimento <= 22){
                    signo = "Libra";
                } else {
                    signo = "Escorpião";
                }
                break;
            case 11:
                if(diaNascimento <= 21){
                    signo = "Escorpião";
                } else {
                    signo = "Sagitário";
                }
                break;
            case 12:
                if(diaNascimento <= 21){
                    signo = "Sagitário";
                } else {
                    signo = "Capricórnio";
                }
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }
        return signo;
    }

 }