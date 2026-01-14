abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
    void displayShapeInfo() {
        System.out.printf("Area of the shape: %.2f\n", calculateArea());
        System.out.printf("Perimeter of the shape: %.2f\n", calculatePerimeter());
    }
}

class Rectangle extends Shape implements Drawable {
    double length;
    double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        return this.length * this.breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.length + this.breadth);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle extends Shape implements Drawable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

interface Drawable {
    void draw();
}

public class ShapeCalculation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 4);
        Circle circle = new Circle(3);
        rectangle.displayShapeInfo();
        circle.displayShapeInfo();
    }
}