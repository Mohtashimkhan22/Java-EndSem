// Define the abstract class Shape
abstract class Shape {
    abstract double rectangleArea(double length, double width);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {
    @Override
    double rectangleArea(double length, double width) {
        return length * width;
    }
    @Override
    double squareArea(double side) {
        return side * side;
    }
    @Override
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class q34 {
    public static void main(String[] args) {
        Area area = new Area();
        double rectangleLength = 5.0;
        double rectangleWidth = 4.0;
        System.out.println("Area of Rectangle: " + area.rectangleArea(rectangleLength, rectangleWidth));
        
        double squareSide = 3.0;
        System.out.println("Area of Square: " + area.squareArea(squareSide));
        
        double circleRadius = 2.5;
        System.out.println("Area of Circle: " + area.circleArea(circleRadius));
    }
}
