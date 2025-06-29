package com.index;
abstract class Marks{
  abstract double getPercentage ();
	}
class classA extends Marks {
	private int sub1,sub2,sub3;
	
	public classA(int s1,int s2,int s3) {
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
	}
	@Override
	double getPercentage() {
		int total = (sub1+sub2+sub3)/3;
		return total;
	}
		
}
class classB extends Marks{
	private int sub1,sub2,sub3,sub4;
	
	public classB(int s1,int s2,int s3,int s4){
		this.sub1 = s1;
		this.sub2 = s2;
		this.sub3 = s3;
		this.sub4 = s4;
	}
	@Override
	double getPercentage() {
		int total = (sub1+sub2+sub3+sub4)/4;
		return total;
	}
	
}
	
public class Task_16_1 {
	public static void main(String[] args) {
		classA studA = new classA(95,96,99);
		classB studB = new classB(98,97,99,96);
		
		System.out.println("Student A Percentage: "+studA.getPercentage());
		System.out.println("Student B Percentage: "+studB.getPercentage());
	}

}
