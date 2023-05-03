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

        String auxString = "";

        for (int i = 0; i < word.length(); i++){
            //System.out.println(word.charAt(i));
            auxString += word.charAt(i);
            System.out.println(auxString);
        }
        for (int i = word.length(); i > 0; i--){
        }

        //Show the result to the user
        //System.out.println("Number of words found: ");

        //END
    }
}
