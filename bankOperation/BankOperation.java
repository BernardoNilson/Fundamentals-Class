package bankOperation;

/*
 * Understanding the problem:  
 * 
 * @author: Bernardo Nilson
 * @version: 07.06.2023
 */

import java.util.*;

public class BankOperation {

    public static void main(String[] args) {
        // Main program!
        Costumer bernardoCostumer = new Costumer("Bernardo", 00011122233, "22/04/2004", null, "bernardonilson360@gmail.com", 900112233);
        System.out.println(bernardoCostumer.toString());

        Scanner scan = new Scanner(System.in);

        int [][] ma = new int [2][4];
        
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.println("valor no indice " + i + " e na coluna " + j);
                ma [i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.println(ma[i][j]);
            }
        }
        
    }
}
