package rectangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods
 * and atributes.
 * Implement three methods: to return the area, the perimeter and the diagonal
 * measure.
 * After that, you need to create two objects in AppRectangle, using the three
 * main methods.
 * 
 * @author: Bernardo Nilson
 * @version: 18.05.2023
 */

public class Rectangle {

    // Atributes
    private double base;
    private double height;

    // Constructor, I used "this" because in this program the variables have the
    // same name as the atributes
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Getters, to "get" the specific atribute
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Setters, to modify the specific atribute
    public void setBase(double newBase) {
        base = newBase;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    // toString , It is used to show all the atrbutes at once
    public String toString() {
        return "Rectangle base equals to " + base + "\nRectangle height equals to " + height;
    }

    // Calculate the rectangles area
    public double calcuteArea() {
        return base * height;
    }

    // Calculate the rectangles perimeter
    public double calculatePerimeter() {
        return 2 * base + 2 * height;
    }

    // Calculate the rectangle diagonal using the Pitagoras Theorem
    public double calculateDiagonal() {
        return Math.sqrt(base * base + height * height);
    }
}