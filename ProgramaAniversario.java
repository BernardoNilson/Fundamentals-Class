/**
 * Problema: Faça um programa que receba a data de aniversário e o dia atual do usuário, manualmente;
 * Com isso, mostre o signo deste usuário. Além, se hoje for o aniversário dele, dê parabéns; se já passou, mostra a sua idade e quantos dias desde o aniversário;
 * se ainda não chegou, mostre quantos dias faltam.
 * 
 * @author: Bernardo Nilson
 * @version: 19.04.2023
 * Descrição: 3º versão, finalização do programa (exibar tudo ao usuário) e testes.
 */

 import java.util.*;

 public class ProgramaAniversario {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        //Receber as variáveis do usuário.
        System.out.println("Opa, tudo bem? Este programa calcula o seu aniversário e o seu signo! Por favor, insira datas válidas");
        System.out.println("Insira o dia do seu nascimento: ");
        int diaNascimento = in.nextInt();

        System.out.println("Insira o mês do seu nascimento: ");
        int mesNascimento = in.nextInt();

        System.out.println("Insira o ano do seu nascimento: ");
        int anoNascimento = in.nextInt();

        System.out.println("Insira o dia de hoje: ");
        int diaHoje = in.nextInt();

        System.out.println("Insira o mês de hoje: ");
        int mesHoje = in.nextInt();
        
        System.out.println("Insira o ano de hoje: ");
        int anoHoje = in.nextInt();

        //Fecha o scanner
        in.close();

        //Por meio de um método, determina o signo da pessoa.
        String signo = obterSigno(mesNascimento, diaNascimento);

        //Por meio de um método, calcula a quantidade de dias até o dia do aniversário.
        int diaAniversario = quantidadeDiaAniversario(mesNascimento, diaNascimento, anoHoje);
        
        //Por meio de um método, calcula a quantidade de dias até o dia atual.
        int diaAtual = quantidadeDiaAtual(mesHoje, diaHoje, anoHoje);

        //Parte final, executa os comandos ao usuário e exibe tudo o que foi calculado.
        if (diaAniversario == diaAtual) System.out.println("Parabéns! Hoje é o seu aniversário.");
        if (diaAniversario > diaAtual){
            System.out.println("Que pena! Ainda faltam " + (diaAniversario-diaAtual) + " para completar " + (anoHoje-anoNascimento) + " anos... Seu signo é " + signo);
        }
        if (diaAniversario < diaAtual) {
            System.out.println("Que pena! Seu aniversário já passou... Seu signo é " + signo + " e você possui " + (anoHoje-anoNascimento) + " anos e " + (diaHoje-diaNascimento) + " dias!");
        }


    }

    //Com o objetivo de deixar o código mais legível e limpo, criamos um método para obter o signo.
    public static String obterSigno(int mesNascimento, int diaNascimento){

        //Definimos signo como um espaço vazio porque o programa não sabe lidar com a variável não declarada.
        String signo = "";

        /**
         * Como funciona? O Switch Case usa um sistema de simulação:
         * Pega uma variável específica (ou operação lógica) e compara com cada caso.
         * Se for certo caso, fará determinada coisa.
         */
        switch (mesNascimento){
            case 1:
                if(diaNascimento <= 20) signo = "Capricórnio";
                 else signo = "Aquário";
                break;
            case 2:
                if(diaNascimento <= 18) signo = "Aquário";
                 else signo = "Peixes";
                break;
            case 3:
                if(diaNascimento <= 20) signo = "Peixes";
                 else signo = "Áries";
                break;
            case 4:
                if(diaNascimento <= 20) signo = "Áries";
                 else signo = "Touro";
                break;
            case 5:
                if(diaNascimento <= 20) signo = "Touro";
                 else signo = "Gêmeos";
                break;
            case 6:
                if(diaNascimento <= 20) signo = "Gêmeos";
                 else signo = "Câncer";
                break;
            case 7:
                if(diaNascimento <= 22) signo = "Câncer";
                 else signo = "Leão";
                break;
            case 8:
                if(diaNascimento <= 22) signo = "Leão";
                 else signo = "Virgem";
                break;
            case 9:
                if(diaNascimento <= 22) signo = "Virgem";
                 else signo = "Libra";
                break;
            case 10:
                if(diaNascimento <= 22) signo = "Libra";
                 else signo = "Escorpião";
                break;
            case 11:
                if(diaNascimento <= 21) signo = "Escorpião";
                 else signo = "Sagitário";
                break;
            case 12:
                if(diaNascimento <= 21) signo = "Sagitário";
                 else signo = "Capricórnio";
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }
        
        return signo;
    }

    public static int quantidadeDiaAniversario(int mesNascimento, int diaNascimento, int anoHoje){
        int diaAniversario = 0;

        switch (mesNascimento){
            case 1:
                diaAniversario = diaNascimento;
                break;
            case 2:
                diaAniversario = diaNascimento + 31;
                break;
            case 3:
                diaAniversario = diaNascimento + 59;
                break;
            case 4:
                diaAniversario = diaNascimento + 90;
                break;
            case 5:
                diaAniversario = diaNascimento + 120;
                break;
            case 6:
                diaAniversario = diaNascimento + 151;
                break;
            case 7:
                diaAniversario = diaNascimento + 181;
                break;
            case 8:
                diaAniversario = diaNascimento + 212;
                break;
            case 9:
                diaAniversario = diaNascimento + 243;
                break;
            case 10:
                diaAniversario = diaNascimento + 273;
                break;
            case 11:
                diaAniversario = diaNascimento + 304;
                break;
            case 12:
                diaAniversario = diaNascimento + 334;
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }

        if ((mesNascimento > 2)&&(verificaBissexto(anoHoje))) diaAniversario++;

        return diaAniversario;
    }

    public static int quantidadeDiaAtual(int mesHoje, int diaHoje, int anoHoje){
        int diaAtual = 0;

        switch (mesHoje){
            case 1:
                diaAtual = diaHoje;
                break;
            case 2:
                diaAtual = diaHoje + 31;
                break;
            case 3:
                diaAtual = diaHoje + 59;
                break;
            case 4:
                diaAtual = diaHoje + 90;
                break;
            case 5:
                diaAtual = diaHoje + 120;
                break;
            case 6:
                diaAtual = diaHoje + 151;
                break;
            case 7:
                diaAtual = diaHoje + 181;
                break;
            case 8:
                diaAtual = diaHoje + 212;
                break;
            case 9:
                diaAtual = diaHoje + 243;
                break;
            case 10:
                diaAtual = diaHoje + 273;
                break;
            case 11:
                diaAtual = diaHoje + 304;
                break;
            case 12:
                diaAtual = diaHoje + 334;
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }
        
        if ((mesHoje > 2)&&(verificaBissexto(anoHoje))) diaAtual++;

        return diaAtual;
    }

    public static boolean verificaBissexto(int anoHoje){
        if (anoHoje % 4 == 0 && (anoHoje % 100 != 0 || (anoHoje % 400 == 0 && anoHoje % 100 == 0))) return true;
        else return false;
    }
}