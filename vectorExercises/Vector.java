package vectorExercises;

/*
 * Undertanding the problem: Create a program that contains:
 * - Method to add two vectors;
 * - Method to return the dot product of two vectors;
 * - Method to return the greatest value of a vector;
 * - Method to return the lowest value of a vector;
 * - Method to subtract two vectors;
 * - Method to change the value of even positions to the odd positions;
 * - Method to subtract -2 of numbers in even positions and subtratc -1 of odd positions, without changing the actual vector;
 * - Menu to permit the user to choose positions offer by your program.
 * 
 * @author: Bernardo Nilson
 * @version: 26.05.2023
 */

import java.util.*;

public class Vector {

    public static void main(String[] args) {
        //Main program!
    }

    public static double [] addVectors (double [] firstVector, double [] secondVector) {
        
        // Both vector needs to have the same length! Make sure you garantee in the main class.

        double [] addResult = new double [firstVector.length];

        for (int i = 0; i < addResult.length; i++) {
            addResult [i] = firstVector [i] + secondVector [i];
        }
        return addResult;
    }

    public static double [] subtractVectors (double [] firstVector, double [] secondVector) {
        
        // Both vector needs to have the same length! Make sure you garantee in the main class.

        double [] subtractResult = new double [firstVector.length];

        for (int i = 0; i < subtractResult.length; i++) {
            subtractResult [i] = firstVector [i] + secondVector [i];
        }
        return subtractResult;
    }

    public static double dotProductOfVectors (double [] firstVector, double [] secondVector) {
        
        // Both vector needs to have the same length! Make sure you garantee in the main class.

        double productResult = 0;

        for (int i = 0; i < firstVector.length; i++) {
            productResult += firstVector [i] * secondVector [i];
        }
        return productResult;
    }

    public static double greatestVectorValue (double [] vector) {

        double aux = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector [i] > aux) {
                aux = vector [i];
            }
        }
        return aux;
    }

    public static double lowestVectorValue (double [] vector) {

        double aux = vector [0];

        for (int i = 1; i < vector.length; i++) {
            if (vector [i] < aux) {
                aux = vector [i];
            }
        }
        return aux;
    }


}
