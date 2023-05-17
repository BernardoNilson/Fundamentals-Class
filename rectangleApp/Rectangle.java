package rectangleApp;

/**
 * Undertanding the problem: Create a class Rectangle with the basics methods and atributes.
 * Also, rectangle area, perimeter and the diagnonal (Pitagoras). After that, you need to create two objects.
 * 
 * @author: Bernardo Nilson
 * @version: 17.05.2023
 */

public class Rectangle {

    //Atributes
    private double base;
    private double height;

    //Constructor method
    public Rectangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    //Getters methods
    public double getBase (){
        return base;
    }
    public double getHeight (){
        return height;
    }

    //Setters methods
    public void setBase (double newBase){
        base = newBase;
    }
    public void setHeight (double newHeight){
        height = newHeight;
    }

    //toString method
    public String toString (){
        return "Rectangle base equals to " + base + "\nRectangle height equals to " + height;
    }

    //Rectangle area 
    public double calcuteArea (){
        return base*height;
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