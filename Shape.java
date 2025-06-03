import java.util.*;

public class Shape{
    public double getArea(){
        return 0.0;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 20.0);
        double area = rectangle.getArea();
        System.out.println("Area is: " + area);
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width =  width;
    }

    public double getArea(){
        return length * width;
    }
}