package dateApp;

/**
 * Undertanding the problem: Create a class Date with the basics methods and atributes.
 * Implement methods to return the month in full (written), to verify if it is a  leap year, 
 * to verify if it is a valid date and return (as a String) the Souls' Day.
 * After doing this, create a object in AppDate and show the results.
 * 
 * 
 * @author: Bernardo Nilson
 * @version: 19.05.2023
 */

import java.util.*;

public class AppDate {

    public static void main(String[] args) {

        // Creates the Scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("\033\143");
        System.out.println("Hey, this program create one date object!\n");

        // Receives the parameters and put them in variables, so it can be used to
        // create the object.
        System.out.println("\nPlease, insert the values for base of the first triangle:");
        double base = scan.nextDouble();
        System.out.println("Now, the values for left side and right side, separated by space:");
        double leftSide = scan.nextDouble();
        double rightSide = scan.nextDouble();

        // Creates the first triangle using the parameters
        Triangle firstTriangle = new Triangle(base, leftSide, rightSide);

        // Receives the parameters and put them in variables, so it can be used to
        // create the object.
        System.out.println("Please, insert the values for base of the second triangle:");
        base = scan.nextDouble();
        System.out.println("Now, the values for left side and right side, separated by space:");
        leftSide = scan.nextDouble();
        rightSide = scan.nextDouble();

        // Closes the Scanner
        scan.close();

        // Creates the second rectangle using the parameters
        Triangle secondTriangle = new Triangle(base, leftSide, rightSide);

        // Shows everything to the user
        System.out.println("\nSo, the first traingle is: " + firstTriangle.verifyType());
        System.out.println("- Total perimeter: " + firstTriangle.calculatePerimeter() + " meters\n- Total area: "
                + decimalFormat.format(firstTriangle.calcuteArea()) + " square meters");

        System.out.println("\nSo, the second traingle is: " + secondTriangle.verifyType());
        System.out.println("- Total perimeter: " + secondTriangle.calculatePerimeter() + " meters\n- Total area: "
                + decimalFormat.format(secondTriangle.calcuteArea()) + " square meters");
    }
}
