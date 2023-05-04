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
        //END
    }
}
