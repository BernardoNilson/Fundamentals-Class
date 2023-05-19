package triangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods
 * and atributes.
 * Implement methods to verify the type of that triangle (isosceles, scalene and
 * equilateral), the area and the perimeter.
 * After doing this, create two objects in AppTriangle, using the main methods.
 * 
 * @author: Bernardo Nilson
 * @version: 18.05.2023
 */

public class Triangle {

    // Atributes
    private double base;
    private double leftSide;
    private double rightSide;

    // Constructor, I choose to use "this" because the variables have the same name as the atributes
    public Triangle(double base, double leftSide, double rightSide) {
        this.base = base;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    // Getters, to "get" the specific atribute
    public double getBase() {
        return base;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    // Setters, to modify the specific atribute with a new value
    public void setBase(double newBase) {
        base = newBase;
    }

    public void setLeftSide(double newLeftSide) {
        leftSide = newLeftSide;
    }

    public void setRightSide(double newRightSide) {
        rightSide = newRightSide;
    }

    // toString, to show all atributes at once
    public String toString() {
        return "Triangle base: " + base + "\nTriangle left side: " + leftSide + "\nTriangle right side: " + rightSide;
    }

    // Verify if a triangle is really a triangle, comparing it side to the others
    public boolean verifyExistence() {
        return (((base + rightSide) > leftSide) && ((base + leftSide) > rightSide) && ((leftSide + rightSide) > base));
    }

    // Verify the type of triangle that we are working with, considering in advance its existence
    public String verifyType() {
        if (verifyExistence()) {
            if ((base == rightSide) && (base == leftSide)) {
                return "Equilateral";
            } else if ((base == rightSide) || (base == leftSide) || (rightSide == leftSide)) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "That is not a triangle!";
        }

    }

    // Triangle perimeter, adding up all the sides
    public double calculatePerimeter() {
        return base + rightSide + leftSide;
    }

    // Triangle area, using Heron's formula, that only use the sides oh a triangle
    public double calcuteArea() {
        
        double semiperimeter = calculatePerimeter() / 2;

        return 0.25 * (Math.sqrt(
                semiperimeter * (semiperimeter - base) * (semiperimeter - rightSide) * (semiperimeter - leftSide)));
    }
}