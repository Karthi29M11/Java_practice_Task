package com.index;

public class Task_5_2 {
	private int acc_no;
	private double acc_bal;
	public int getAcc_no() {
		return acc_no;
	}
	public Double getAcc_bal() {
		return acc_bal;
	}
	public void setBank(int no ,double bal) {
		this.acc_no = no;
		this.acc_bal = bal;
	}
	public static void main(String[] args) {
		Task_5_2 input = new Task_5_2();
		input.setBank(987654321,99999.987);
		System.out.println("Bank Info : ");
		System.out.println("Account_Number :" +input.getAcc_no());
		System.out.println("Bank_Balance :" +input.getAcc_bal());
	}

}
