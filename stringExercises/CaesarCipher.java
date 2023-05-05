package stringExercises;

/**
 * Understanding the problem: Create a encription system based on Caesar Cipher, which replace each letter for another one
 * in a different position in the alphabet. Let the user insert two phrases and encrypt them, after that, the user has two guesses
 * to descovery the unlock key.
 * 
 * @author: Bernardo Nilson 
 * @version: 04.05.2023
 */

import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) {

        //Open the Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey, this program receives two phrases and encrypt them. Guess the unlock key.\n");

        //Receives the variables
        System.out.println("Alright, insert your first phrase:");
        String firstPhrase = scan.nextLine().toLowerCase();
        System.out.println("Now, your second phrase:");
        String secondPhrase = scan.nextLine().toLowerCase();

        String encryptedFirstPhrase = "";
        String encryptedSecondPhrase = "";

        //Unlock key
        int position = 5;

        //Encrypt the first phrase, with the unlock key defined in "position"
        for (int i = 0; i < firstPhrase.length(); i++){
            char letter = firstPhrase.charAt(i); //Separe each phrase character

            //If the position letter goes out of range, it can return the alphanet
            if (letter >= (char)('z' - position + 1)) letter = (char)(letter - 26);
            
            //Deslocate the message
            letter = (char)(letter + position);
 
            //Add each letter in the pharse
            encryptedFirstPhrase += letter;
        }
        System.out.println("First encrypted phrase: " + encryptedFirstPhrase);

        //Encrypt the second phrase, with the unlock key defined in "position"
        for (int i = 0; i < secondPhrase.length(); i++){
            char letter = secondPhrase.charAt(i); //Separe each phrase character

            //If the position letter goes out of range, it can return the alphanet
            if (letter >= (char)('z' - position + 1)) letter = (char)(letter - 26);
            
            //Deslocate the message
            letter = (char)(letter + position);
 
            //Add each letter in the pharse
            encryptedSecondPhrase += letter;
        }
        System.out.println("Second encrypted phrase: " + encryptedSecondPhrase);

        int unlockKey = 0;
        for (int i = 1; (i <= 3)&&(unlockKey != position); i++){
            System.out.println("Try to guess the unlock key (just the number):");
            unlockKey = scan.nextInt();
        }

        //Closes the Scanner object
        scan.close();

        if (unlockKey == position) System.out.println("Congrats! You've guessed right!");
        else {
            System.out.println("Unfortunately, you haven't guessed!");
            System.out.println("The encryption system works like the Caesar Cipher, deslocating the alphabet in " + position + " positions!");
        }

        //END
    }
}