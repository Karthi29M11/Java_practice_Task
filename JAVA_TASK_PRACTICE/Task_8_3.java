package com.index;

// Base class
class Shape {
    public void getPerimeter() {
        System.out.println("Perimeter method in Shape");
    }

    public void getArea() {
        System.out.println("Area method in Shape");
    }
}

// Subclass that overrides Shape
class Circle extends Shape {
    double r = 10.2;

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("The Perimeter of the Circle is: " + perimeter);
    }

    @Override
    public void getArea() {
        double area = Math.PI * r * r;
        System.out.println("The Area of the Circle is: " + area);
    }
}

// Main class
public class Task_8_3 {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.getPerimeter();
        cir.getArea();
    }
}
