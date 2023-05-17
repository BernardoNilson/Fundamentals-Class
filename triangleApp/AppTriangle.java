package triangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods and atributes.
 * Also, rectangle area, perimeter and the diagnonal (Pitagoras). After that, you need to create two objects.
 * 
 * @author: Bernardo Nilson
 * @version: 17.05.2023
 */

 import java.util.*;

 public class AppTriangle {

    public static void main (String [] args){
        
        //Create the Scanner object
        Scanner scan = new Scanner (System.in);

        System.out.print("\033\143");
        System.out.println("Hey, this program create two rectangles objects!\n");

        //Receives the parameters and put them in variables
        System.out.println("Please, insert the base and the height (double), separates by one space:");
        double base = scan.nextDouble();
        double height = scan.nextDouble();

        //Create the first rectangle using the parameters
        Rectangle firstRectangle = new Rectangle(base, height);

        //Receives the parameters and put them in variables
        System.out.println("Please, insert the base and the height (double), separates by one space:");
        base = scan.nextDouble();
        height = scan.nextDouble();

        //Close the Scanner
        scan.close();

        //Create the second rectangle using the parameters
        Rectangle secondRectangle = new Rectangle(base, height);

        //Exibes everything to the user
        System.out.print("\nFirst rectangle area is equal to " + firstRectangle.calcuteArea() + "\nFirst rectangle perimeter is equal to " + firstRectangle.calculatePerimeter() + "\nFirst rectangle diagonal is equal to ");
        System.out.printf("%.2f", firstRectangle.calculateDiagonal());

        System.out.print("\n\nSecond rectangle area is equal to " + secondRectangle.calcuteArea() + "\nSecond rectangle perimeter is equal to " + secondRectangle.calculatePerimeter() + "\nSecond rectangle diagonal is equal to ");
        System.out.printf("%.2f", secondRectangle.calculateDiagonal());
    }
 }
