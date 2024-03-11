
interface Shape {
    double calculateArea();
}


abstract class AbstractShape implements Shape {
    protected double area;

    public AbstractShape() {
        initialize();
        calculateArea();
    }

    public abstract void initialize();

    public void displayDetails() {
        
        System.out.println("Area: " + area);
    }
}


class Circle extends AbstractShape {
    private double radius;

    
    public void initialize() {
        System.out.println("loading Circle...");
        radius = 5.0; 
    }

    
    public double calculateArea() {
        area = 3.14 * radius * radius;
        return area;
    }
}

class Rectangle extends AbstractShape {
    private double length;
    private double width;

    
    public void initialize() {
        System.out.println("loading Rectangle...");
        length = 6.0; 
        width = 3.0;  
    }

    
    public double calculateArea() {
        area = length * width;
        return area;
    }
}

public class ShapeCreation{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.displayDetails();

        rectangle.displayDetails();
    }
}