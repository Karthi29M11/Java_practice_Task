package com.index;
class Employee{
	public void work() {
		System.out.println("I'm Working On this Company");
	}
	public void getSalary() {
		System.out.println("Company give me a Proper Salary");
	}
}

class HrManager extends Employee{
	public void work() {
		System.out.println("I'm the HR of this Company ");
	}
	public void addEmployee() {
		System.out.println("I fire you.Your Role is going to Another One");
		}
}

public class Task_8_1 {
	public static void main(String[]args) {
		HrManager obj = new HrManager();
		obj.work();
		obj.addEmployee();
		obj.getSalary();
		
	}

}
