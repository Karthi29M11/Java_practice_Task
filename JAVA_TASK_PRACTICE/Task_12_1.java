package com.index;
class Student{
	int id,age;
	String name,location,degree,branch;
	
	Student(int i,int a,String n,String l,String d,String b){
		this.id = i;
		this.age = a;
		this.name = n;
		this.location = l;
		this.degree =d;
		this.branch = b;
	}
	void display() {
		System.out.println("\n--------------Student_Details-------------------");
		System.out.println("The Student of the id is :" +id);
		System.out.println("The Age of the Student is :"+age);
		System.out.println("The Name of the Student is :"+name);
		System.out.println("The Location of the Student is :" +location);
		System.out.println("The Department of the Student is :"+degree);
		System.out.println("The Branch of the Student is : "+branch);
	}
}

public class Task_12_1 {
	public static void main(String[] args) {
		Student[] stu = new Student[6];
		
		stu[0] = new Student(01,21,"Rossi","North","b.tech","AI&DS");
		stu[1] = new Student(02,21,"Thiru","South","b.com","Commerece");
		stu[2] = new Student(03,21,"Eskkai","East","b.com","Compter");
		stu[3] = new Student(04,23,"Samuel","West","b.tech","CS");
		stu[4] = new Student(05,24,"Venkadash","North","b.tech","IT");
		stu[5] = new Student(06,21,"Naveen","South","b.tech","CSE");
			
		for(int i =0;i<stu.length;i++) {
			stu[i].display();
		}
		
	}

}
