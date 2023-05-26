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
 * - Method to count the even and odd numbers in a vector
 * - Method to count even frequency
 * - 
 * - Menu to permit the user to choose positions offer by your program.
 * 
 * @author: Bernardo Nilson
 * @version: 26.05.2023
 */

import java.util.*;

import library.library;

public class Vector {

    public static void main(String[] args) {
        // Main program!

        double[] vectorX = { 3, 5, 7, 8 };

        showContent(vectorX);

    }

    public static double[] addVectors(double[] firstVector, double[] secondVector) {

        // Both vector needs to have the same length! Make sure you garantee in the main
        // class.

        double[] addResult = new double[firstVector.length];

        for (int i = 0; i < addResult.length; i++) {
            addResult[i] = firstVector[i] + secondVector[i];
        }
        return addResult;
    }

    public static double[] subtractVectors(double[] firstVector, double[] secondVector) {

        // Both vector needs to have the same length! Make sure you garantee in the main
        // class.

        double[] subtractResult = new double[firstVector.length];

        for (int i = 0; i < subtractResult.length; i++) {
            subtractResult[i] = firstVector[i] + secondVector[i];
        }
        return subtractResult;
    }

    public static double dotProductOfVectors(double[] firstVector, double[] secondVector) {

        // Both vector needs to have the same length! Make sure you garantee in the main
        // class.

        double productResult = 0;

        for (int i = 0; i < firstVector.length; i++) {
            productResult += firstVector[i] * secondVector[i];
        }
        return productResult;
    }

    public static double greatestVectorValue(double[] vector) {

        double aux = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > aux) {
                aux = vector[i];
            }
        }
        return aux;
    }

    public static double lowestVectorValue(double[] vector) {

        double aux = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < aux) {
                aux = vector[i];
            }
        }
        return aux;
    }

    public static double[] changeEvenToOddPositions(double[] vector) {

        // Aiming to work properly, we need to have a vector with even positions (e.g.
        // 8, 6, 10 elements)! Make sure you garantee in the main class.

        double[] changedVector = new double[vector.length];

        for (int i = 0; i < vector.length; i++) {

            if (i == (vector.length - 1)) {
                changedVector[i] = vector[0];
            } else {
                changedVector[i] = vector[i + 1];
            }
        }

        return changedVector;
    }

    public static void showEvenOddQuantity(double[] vector) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < vector.length; i++) {
            if (library.isEven(vector[i])) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even quantity is " + even);
        System.out.println("Odd quantity is " + odd);
    }

    public static void evenFrequency(double[] vector) {

        for (int i = 0; i < vector.length; i++) {
            int even = 0;
            if (library.isEven(vector[i])) {
                for (int j = 0; j < vector.length; j++) {
                    if (vector [i] == vector [j]){
                        even++;
                    }
                }
                
            }
        }

        System.out.println("Even quantity is " + even);
        System.out.println("Odd quantity is " + odd);
    }

    public static void showContent(double[] vector) {
        System.out.println("Content of vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Value in index " + i + " is " + vector[i]);
        }
    }
}
