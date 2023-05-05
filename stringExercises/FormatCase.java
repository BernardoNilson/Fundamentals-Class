package stringExercises;

/**
 * Problem: Write a program that receive a upper case phrase and return that phrase in lowercase.
 * After, receive a lowercase phrase and return that phrase in upper case.
 * 
 * @author: Bernardo Nilson 
 * @version: 05.05.2023
 */

import java.util.*;

public class FormatCase {

    public static void main(String[] args) {

        //Open the Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, this program receives a phrase and return the phrase formated.\n");

        //Here, it scan the whole line, not only a word.
        System.out.println("Please, insert your phrase in UPPERCASE:");
        String firstPhrase = scan.nextLine().toLowerCase(); //Transform to lowercase

        System.out.println("Your phrase: " + firstPhrase);

        System.out.println("Please, insert your phrase in lowercase:");
        String secondPhrase = scan.nextLine().toUpperCase(); //Transform to UPPERCASE

        System.out.println("Your phrase: " + secondPhrase);

        //Closes the Scanner object
        scan.close();

        //END
    }
}
