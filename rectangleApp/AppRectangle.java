package rectangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods and atributes.
 * Implement three methods: to return the area, the perimeter and the diagonal measure.
 * After that, you need to create two objects in AppRectangle, using the three main methods.
 * 
 * @author: Bernardo Nilson
 * @version: 18.05.2023
 */

import java.util.*;
import java.text.DecimalFormat;

public class AppRectangle {

    public static void main(String[] args) {

        // Creates the Scanner object
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.000");

        System.out.print("\033\143");
        System.out.println("Hey, this program create two rectangles objects!\n");

        // Receives the parameters and put them in variables, so it can be used to
        // create the object.
        System.out.println("\nPlease, insert value for base and height of the first rectangle, separates by space:");
        double base = scan.nextDouble();
        double height = scan.nextDouble();

        // Creates the first rectangle using the parameters
        Rectangle firstRectangle = new Rectangle(base, height);

        // Receives the parameters and put them in variables
        System.out.println("Please, insert value for base and height of the second rectangle, separates by space:");
        base = scan.nextDouble();
        height = scan.nextDouble();

        // Closes the Scanner
        scan.close();

        // Creates the second rectangle using the parameters
        Rectangle secondRectangle = new Rectangle(base, height);

        // Shows everything to the user
        System.out.println("\nFirst rectangle:\n- Total area is: " + firstRectangle.calcuteArea()
                + " square meters\n- Total perimeter is: " + firstRectangle.calculatePerimeter()
                + " meters\n- Diagonal measure is: " + decimalFormat.format(firstRectangle.calculateDiagonal())
                + " meters");

        System.out.println("\nSecond rectangle:\n- Total area is: " + secondRectangle.calcuteArea()
                + " square meters\n- Total perimeter is: " + secondRectangle.calculatePerimeter()
                + " meters\n- Diagonal measure is: " + decimalFormat.format(secondRectangle.calculateDiagonal())
                + " meters");
    }
}
