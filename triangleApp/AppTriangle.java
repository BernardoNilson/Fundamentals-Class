package triangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods and atributes.
 * Implement methods to verify the type of that triangle (isosceles, scalene and equilateral), the area and the perimeter.
 * After doing this, create two objects in AppTriangle, using the main methods.
 * 
 * @author: Bernardo Nilson
 * @version: 18.05.2023
 */

import java.util.*;
import java.text.DecimalFormat;

public class AppTriangle {

    public static void main(String[] args) {

        // Creates the Scanner object
        Scanner scan = new Scanner(System.in);
        // Creates a Formatter object
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.000");

        System.out.print("\033\143");
        System.out.println("Hey, this program create two triangles objects!\n");

        // Receives the parameters and put them in variables, so it can be used to
        // create the object.
        System.out.println("Please, insert the values for base of the first triangle:");
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
