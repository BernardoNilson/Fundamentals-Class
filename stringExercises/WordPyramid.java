package stringExercises;

/**
 * Problem: Write a program that shows the follow output. using the charAt() method:
 * J
 * Ja
 * Jav
 * Java
 * Jav
 * Ja
 * J
 *  - 1º Method: Using charAt();
 *  - 2º Method: Using substring();
 * 
 * @author: Bernardo Nilson 
 * @version: 03.05.2023
 */

import java.util.*;

public class WordPyramid {

    public static void main(String[] args) {

        //Open the Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, this program receives a word and splits it in a pyramid.\n");

        System.out.println("Now, insert one word:");
        String word = scan.next(); //Scan just one word

        //Closes the Scanner object
        scan.close();

        //Using chatAt();
        //Starts the counting til the number of lines required.
        for (int i = 0; i < word.length()*2; i++){ 

            int limit; 
            if (i < word.length()) limit = i; //Define the limit to the counter i - increase position
            else limit = word.length()*2 - i; //Define the limit to the counter i, negatively - decrease position

            //Show, using only "print", not "println", the character sequence til the limit
            for (int j = 0; j < limit; j++){
                System.out.print(word.charAt(j));
            }

            //To skip to next line
            System.out.println();
        }

        //Using substring();
        for (int i = 0; i < word.length()*2; i++){ 
            if (i <= word.length()) System.out.println(word.substring(0, i));
            else System.out.println(word.substring(0, (word.length()*2 - i)));
        }

        //END
    }
}
