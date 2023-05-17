package triangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods and atributes.
 * Also, rectangle area, perimeter and the diagnonal (Pitagoras). After that, you need to create two objects.
 * 
 * @author: Bernardo Nilson
 * @version: 17.05.2023
 */

public class Triangle {

    //Atributes
    private double base;
    private double leftSide;
    private double rightSide;

    //Constructor method
    public Triangle (double base, double leftSide, double rightSide){
        this.base = base;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    //Getters methods
    public double getBase (){
        return base;
    }
    public double getLeftSide (){
        return leftSide;
    }
    public double getRightSide (){
        return rightSide;
    }

    //Setters methods
    public void setBase (double newBase){
        base = newBase;
    }
    public void setLeftSide (double newLeftSide){
        leftSide = newLeftSide;
    }
    public void setRightSide (double newRightSide){
        rightSide = newRightSide;
    }

    //toString method
    public String toString (){
        return "Triangle base: " + base + "Triangle left side: " + leftSide + "Triangle right side: " + rightSide;
    }

    //Triangle area 
    public double calcuteArea (){
        return 
    }

    //Rectangle perimeter
    public double calculatePerimeter (){
        return 2*base + 2*height;
    }

    //Rectangle diagonal
    public double calculateDiagonal (){
        return Math.sqrt(base*base + height*height);
    }
}