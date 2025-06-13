package com.index;

public class Task_4_1 {
	int id;
	String details,name,designation,location;
	public Task_4_1(int i,String d,String n,String dn,String l)
	{
		id=i;
		details=d;
		name=n;
		designation=dn;
		location=l;
	}
	public void display() {
		System.out.println("\nEmployee id :" +id);
		System.out.println("Employee Details :" +details);
		System.out.println("Employee Name :" +name);
		System.out.println("Employee designation :" +designation);
		System.out.println("Employee Location :" +location);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
		Task_4_1 emp = new Task_4_1(1,"FullStackDeveloper","Karthi","FrontEnd Developer","Kanchipuram");
		Task_4_1 emp1 = new Task_4_1(2,"FullStackDeveloper","Thiru","Backend Developer","Arakkonam");
		Task_4_1 emp2 = new Task_4_1(3,"FullStackDeveloper","Samuel","Senior Developer","Chennai");
		Task_4_1 emp3 = new Task_4_1(4,"FullStackDeveloper","Durai","Server Maintainence","Tenkasi");
		Task_4_1 emp4 = new Task_4_1(5,"FullStackDeveloper","Venkadash","Database Manager","Chennai");
		emp.display();
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
				
	}
	
	}


