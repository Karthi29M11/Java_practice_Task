package com.index;
// Abstract Shape class
abstract class Shaper {
    protected int numSides;

    public Shaper(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    abstract double getArea();
    abstract double getPerimeter();
}

// Rectangle subclass
class Rectangle extends Shaper {
    private double width, height;

    public Rectangle(double width, double height) {
        super(4); // Rectangle has 4 sides
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}

// Right Triangle subclass
class RtTriangle extends Shaper {
    private double width, height;

    public RtTriangle(double width, double height) {
        super(3); // Triangle has 3 sides
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return (width * height) / 2;
    }

    @Override
    double getPerimeter() {
        // Pythagorean theorem for hypotenuse
        double hypotenuse = Math.sqrt(width * width + height * height);
        return width + height + hypotenuse;
    }
}

// Main class
public class Task_16_2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 10.0);
        RtTriangle tri = new RtTriangle(3.0, 4.0);

        System.out.println("Rectangle:");
        System.out.println("Sides: " + rect.getNumSides());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        System.out.println("\nRight Triangle:");
        System.out.println("Sides: " + tri.getNumSides());
        System.out.println("Area: " + tri.getArea());
        System.out.println("Perimeter: " + tri.getPerimeter());
    }
}
