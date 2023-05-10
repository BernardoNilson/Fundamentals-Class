/**
 * Problema: Faça um código que encontre o maior entre três variáveis.
 * 1º Versão: Não pode usar IF/ELSE e deve usar IF e operadores lógicos.
 * 2º Versão: Só pode usar IF/ELSE e não pode usar operadores lógicos.
 * 3º Versão: Não pode usar IF/ELSE e nem operadores lógicos; usar uma variável auxiliar.
 * 
 * @author: Bernardo Nilson 
 * @version: 29.03.2023
 */

 import java.util.Scanner;

 public class MaiorNumero {

    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        double varUm, varDois, varTres;
        
        System.out.println("Insira o valor da 1º variável: ");
        varUm = in.nextDouble();
        
        System.out.println("Insira o valor da 2º variável: ");
        varDois = in.nextDouble();
        
        System.out.println("Insira o valor da 3º variável: ");
        varTres = in.nextDouble();
        
        in.close();

        //1º Versão
        if (varUm >= varDois && varUm >= varTres){
            System.out.println("1ºMétodo:\nMaior número: " + varUm);
        }
        
        if (varDois >= varUm && varDois >= varTres){
            System.out.println("1ºMétodo:\nMaior número: " + varDois);
        }
        
        if (varTres >= varDois && varTres >= varUm){
            System.out.println("1ºMétodo:\nMaior número: " + varTres);
        }
        
        //2º Versão
        if (varUm >= varDois){
            if (varUm >= varTres){
                System.out.println("2ºMétodo:\nMaior número: " + varUm);
            } else {
                System.out.println("2ºMétodo: \nMaior número: " + varTres);
            }
        } else {
            if (varDois >= varTres){
                System.out.println("2ºMétodo: \nMaior número: " + varDois);
            } else {
                System.out.println("2ºMétodo: \nMaior número: " + varTres);
            }
        }

        //3º Versão
        double aux = varUm;
        if (varDois >= aux){
            aux = varDois;
        }
        if (varTres >= aux){
            aux = varTres;
        }
        System.out.println("3ºMétodo: \nMaior número: " + aux);
    }
 }
 
