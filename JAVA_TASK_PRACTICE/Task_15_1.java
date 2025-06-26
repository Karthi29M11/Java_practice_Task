package com.index;
interface Shapes{
	void getArea();
}
class Rectangles2 implements Shapes{
	public void getArea() {
		double w = 8.5;
		double l =9.9;
		System.out.println("Area of Rectangle :"+w*l);
	}
}
		
class Circle2 implements Shapes{
	public void getArea() {
		double r = 12.9;
		System.out.println("Area of Circle :" + Math.PI * r);
		
	}
}

class Triangle2 implements Shapes{
	public void getArea() {
		double base = 23.5;
		double height = 14.5;
		System.out.println("Area of Triangle :" +(base*height/2));
		}
}


	
public class Task_15_1 {
	public static void main(String[] args) {
		Shapes s = new Rectangles2();
		s.getArea();
		Shapes s1 = new Circle2();
		s1.getArea();
		Shapes s2 = new Triangle2();
		s2.getArea();
	
	}

}
