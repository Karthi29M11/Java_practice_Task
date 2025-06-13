package com.index;

public class Task_6_2 {
	private int id;
	private String name,designation;
	Task_6_2(int i){
		id = i;
	}
	Task_6_2(int i,String n){
		id = i;
		name =n;
	}
	Task_6_2(int i,String n,String d){
		id = i;
		name = n;
		designation =d;
	}
	void display() {
		System.out.println("The Id , Name and Designation is :" +id+ " " +name+ " " +designation);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task_6_2 obj = new Task_6_2(1);
		Task_6_2 obj1 = new Task_6_2(1,"Rossi");
		Task_6_2 obj2 = new Task_6_2(1,"Rossi","Software Testing");
		obj.display();
		obj1.display();
		obj2.display();
	}

}
