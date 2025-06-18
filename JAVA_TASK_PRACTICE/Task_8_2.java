package com.index;
class BankAccount{
	 double balance;
	
	public BankAccount() {
		balance = 1000;
	}
	public void Deposit(double amount) {
		balance +=amount;
		System.out.println("Deposites : $" +amount+ ". Current Balance : $" +balance);
	}
	public void Withdraw(double amount) {
		balance += amount;
		System.out.println("Deposites : $ " +amount+  " .Current Balance : $" +balance);
	}
}
class SavingAccount extends BankAccount{
	@Override
	public void Withdraw(double amount) {
		if(balance - amount < 100) {
		System.out.println("Withdrawal denied! Balance would fall below ₹100.");
		}else {
			balance-=amount;
			System.out.println("Deposites : $" +amount+ ". Current Balance : $" +balance);
		}
	}
}

public class Task_8_2 {
	public static void main(String[] args) {
		SavingAccount obj = new SavingAccount();
		obj.Deposit(500);
		obj.Withdraw(300);
		obj.Withdraw(400);
		
	}
}
