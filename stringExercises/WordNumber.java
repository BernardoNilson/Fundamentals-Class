package stringExercises;

/**
 * Problem: Write a program that receive a phrase and a word from the user e count how
 * many this word appear in that phrase. Show to the user.
 * 
 * @author: Bernardo Nilson 
 * @version: 03.05.2023
 */

import java.util.*;

public class WordNumber {

    public static void main(String[] args) {

        //Open the Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, this program receives a phrase, a word and return how many times this word appear.\n");

        //Here, it scan the whole line, not only a word.
        System.out.println("Please, insert your phrase:");
        String phrase = scan.nextLine().toLowerCase(); //To avoid uppercase errors, this method reduces everything to lowercase
        System.out.println("Now, insert one word:");
        String word = scan.next().toLowerCase(); //Scan just one word and convert to lowercase.

        //Closes the Scanner object
        scan.close();

        String[] wordPhrase = phrase.split("[,\\s.]+"); //Split every word of that phrase in an array. Considering " ". "," and ".". The operator "+" is used like a OR.
        int wordCount = 0;

        for (int i = 0; i < wordPhrase.length; i++){
            if (word.equals(wordPhrase[i])) wordCount++;
        }

        //Show the result to the user
        System.out.println("Number of words found: " + wordCount);

        //END
    }
}
