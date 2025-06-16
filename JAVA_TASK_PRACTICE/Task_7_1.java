package com.index;
//Method OverLoading
public class Task_7_1 {
	private int id,age;
	private String name,location;
	Task_7_1(int i,int a){
		this.id = i;
		this.age = a;
	}
	Task_7_1(int i,int a,String n){
		this.id = i;
		this.age = a;
		this.name = n;
	}
	Task_7_1(int i,int a,String n,String l){
		this.id = i;
		this.age = a;
		this.name = n;
		this.location =l;
	}
	void display() {
		System.out.println("\nThe Id of Employee1 is :" +id);
		System.out.println("The Age of Employee2 is :" +age);
		System.out.println("The Name of Employee3 is :" +name);
		System.out.println("The Location of Employee is :" +location);
	}
	public static void main(String[] args) {
		Task_7_1 emp = new Task_7_1(111,22,"Rossi","Kanchipuram");
		Task_7_1 emp1 = new Task_7_1(112,21,"Thiru","Arakkonam");
		Task_7_1 emp2 = new Task_7_1(113,23,"Sam","Chennai");
		emp.display();
		emp1.display();
		emp2.display();

	}
	

}
