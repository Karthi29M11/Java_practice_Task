package com.index;

public class Task_5_3 {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	
	public void setCircle(double radius) {
		this.radius = radius;
	}
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}

	public static void main(String[] args) {
		Task_5_3 circle = new Task_5_3();
		circle.setCircle(7.6);
	System.out.println("----Circle----");
	System.out.println("The Radius of Circle :" +circle.getRadius());
	System.out.println("The Perimeter of Circle is : " +circle.perimeter());
	System.out.println("The Area of Circle is  :" +circle.area());
	}

}
