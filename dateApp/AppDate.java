package dateApp;

/**
 * Undertanding the problem: Create a class Date with the basics methods and atributes.
 * Implement methods to return the month in full (written), to verify if it is a  leap year, 
 * to verify if it is a valid date and return (as a String) the Souls' Day.
 * After doing this, create a object in AppDate and show the results.
 * 
 * 
 * @author: Bernardo Nilson
 * @version: 21.05.2023
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
        System.out.println("\nPlease, insert the date in format (dd mm yyyy):");
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        // Creates the first triangle using the parameters
        Date firstDate = new Date(day, month, year);

        // Closes the Scanner
        scan.close();

        // Shows everything to the user
        if (firstDate.verifyDateExistence()) {
            System.out.println("\nYour date is valid");
        } else {
            System.out.println("\nYour date is not valid, sorry!");
            System.exit(0);
        }

        System.out.println("\nSo, this month is " + firstDate.showMonthFull() + "\n");

        if (firstDate.verifyLeapYear()) {
            System.out.println("Wow, we are in a Leap Year!");
        } else {
            System.out.println("Unfotunately, we are not in a Leap Year! :(");
        }

        System.out.println("\n" + firstDate.showSoulsDay());
    }
}
