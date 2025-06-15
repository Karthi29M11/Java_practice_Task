package com.index;
//Method OverLoading
public class Task_7_1 {
	public int employee1(int id) {
		return id;
	}
	public int employee2(int age) {
		return age;
	}
	public String employee3(String name) {
		return name;
	}
	public String employee4(String location) {
		return location;
	}
	public static void main(String[] args) {
		Task_7_1 emp1 = new Task_7_1();
		System.out.println("The Id of Employee1 is :" +emp1.employee1(11));
		System.out.println("The Age of Employee2 is :" +emp1.employee2(23));
		System.out.println("The Name of Employee3 is :" +emp1.employee3("Rossi"));
		System.out.println("The Location of Employee is :" +emp1.employee4("Kanchipuram"));
	}
	

}
