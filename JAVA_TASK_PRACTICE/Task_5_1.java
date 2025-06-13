package com.index;
//import java.util.Scanner;
public class Task_5_1 {
	private int id;
	private String name,location;
	public int getId() {
		return id;
	}
	public String getName(){
		return name;
	}
	public String getLocation() {
		return location;
	}
	public void setdata(int id,String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public static void main(String[] args) {
	Task_5_1 obj = new Task_5_1();

	//Scanner input = new Scanner(System.in);
	//System.out.print("Enter the Employee_id :");
	//int id = input.nextInt();
	//input.nextLine();
	
	//System.out.print("Enter the Employee_name :");
	//String name = input.nextLine();
	
	//System.out.print("Enter the Location :");
	//String location = input.nextLine();
	//obj.setdata(id, name, location);
	obj.setdata(101,"Karthi","Kanchipuram");
	System.out.println("User_Data :--");
	System.out.println("Id :"+obj.getId());
	System.out.println("Name :" +obj.getName());
	System.out.println("Location :" +obj.getLocation());

	}

}
