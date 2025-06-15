package com.index;
//Singlethon Instance
public class Task_7_2 {
	private int order,date,ph_no;
	private String app,location,product,name;
	
	private Task_7_2(int order,int date,int ph_no,String name,String app,String location,String product) {
		this.order = order;
		this.date = date;
		this.ph_no = ph_no;
		this.name = name;
		this.app = app;
		this.location = location;
		this.product = product;
	}
	public static Task_7_2 createFactroyMethod(int order,int date,int ph_no,String name,String app,String location,String product) {
		return new Task_7_2(order,date, ph_no, name, app, location, product);
	}
	public static void main(String[]args) {
		Task_7_2 book =  Task_7_2.createFactroyMethod(101,15,987654321,"Rossi","Amazon","Chennai","FaceWash");
		Task_7_2 book1 = Task_7_2.createFactroyMethod(102,14,987675432,"Thiru","Flipkart","Arakkonam","BodyWash");
		Task_7_2 book2 = Task_7_2.createFactroyMethod(103,13,87654328, "Durai","Meesho","Tenkasi","Phone");
		System.out.println("Order_No : "+book.order + ", Date : "+book.date +", ph_no : " +book.ph_no + ", Name : "+book.name + ", App : "+book.app + ", Location : " +book.location +", Product : "+book.product );
		System.out.println("Order_No : "+book1.order + ", Date : "+book1.date +", ph_no : " +book1.ph_no + ", Name : "+book1.name + ", App : "+book1.app + ", Location : " +book1.location +", Product : "+book1.product );
		System.out.println("Order_No : "+book2.order + ", Date : "+book2.date +", ph_no : " +book2.ph_no + ", Name : "+book2.name + ", App : "+book2.app + ", Location : " +book2.location +", Product : "+book2.product );
	}
	

}
