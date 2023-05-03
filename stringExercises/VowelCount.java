package stringExercises;

/**
 * Problem: Write a program that receive a phrase from the user and count 
 * how many vowels exist in that phrase. 
 * 
 * @author: Bernardo Nilson 
 * @version: 02.05.2023
 */

import java.util.*;

public class VowelCount {

    public static void main(String[] args) {

        //Open the Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, this program receives a phrase and return the number of vowels.\n");

        //Here, it scan the whole line, not only a word.
        System.out.println("Please, insert your phrase:");
        String phrase = scan.nextLine().toLowerCase(); //To avoid uppercase errors, this method reduces everything to lowercase
      
        //Closes the Scanner object
        scan.close();

        //Put all vowels in an array
        char[] vowel = {'a','e','i','o','u'};
        int vowelCount = 0;

        //For each phrase's position, it compare to the vowels.
        for (int i = 0; i < phrase.length(); i++){
            for (int ii = 0; ii < vowel.length; ii++){
                if (phrase.charAt(i)==vowel[ii]){
                    vowelCount++;
                    break; //Otimize the program
                }
            }
        }

        //Show the result to the user
        System.out.println("Number of vowels found: " + vowelCount);

        //END
    }
}
