
/**
 * Undertanding the problem: Write a program that generate the firs ten numbers
 * of the Fibonacci Sequence, storage this terms in a vector an show it later.
 * 
 * @author: Bernardo Nilson
 * @version: 02.06.2023
 */

public class FibonacciSequence {

    public static void main(String[] args) {

        // Clean the terminal 
        System.out.print("\033\143");
        System.out.println("Hey, this program shows you the first FORTY numbers of Fibonacci sequence!\n");

        // Create the vector object
        int [] fibonacciNumbers = new int [40];

        // Define the two first terms
        fibonacciNumbers [0] = 1;
        fibonacciNumbers [1] = 1;

        // Loop to define the others numbers of Fibonacci sequence
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers [i] = fibonacciNumbers [i-1] + fibonacciNumbers [i-2];
    
        }
        
        // Loop to show to the user all the Fibonacci numbers 
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            System.out.println(fibonacciNumbers [i]);
        }

        // END
    }
}
