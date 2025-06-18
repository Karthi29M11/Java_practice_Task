package com.index;
class Recipe{
	public void getRecipe() {
		System.out.println("Make A Recipe");
	}
		public void getInstruction() {
			System.out.println("The Recipes are Pasta,Salad and Cake");	

	}
}
class Pasta extends Recipe{
	public void getRecipe() {
		System.out.println("Pasta is made with Maida and Vegetables  ");
	}
	public void getInstruction() {
		System.out.println("Boil pasta, add sauce and spices, mix well.");
	}
	
}
class Cake extends Recipe{
	public void getRecipe() {
		System.out.println("Cake ingredients include flour, sugar, eggs, chocolate  ");
	}
	public void getInstruction() {
		System.out.println("Bake at 180°C for 30 minutes  ");
	}
}
class Salad extends Recipe{
	public void getRecipe() {
		System.out.println("Salad is made with fruits and vegetables  ");
	}
	public void getInstruction() {
		System.out.println("Chop ingredients, mix with dressing, serve fresh  ");
	}
}
public class Task_9_1 {
	public static void main(String[] args) {
		Recipe obj = new Recipe();
		Cake obj1 = new Cake();
		Pasta obj2 = new Pasta();
		Salad obj3 = new Salad();
		obj.getRecipe();
		obj.getInstruction();
		
		obj1.getRecipe();
		obj1.getInstruction();
		
		obj2.getRecipe();
		obj2.getInstruction();
		
		obj3.getRecipe();
		obj3.getInstruction();
		

	}

}
