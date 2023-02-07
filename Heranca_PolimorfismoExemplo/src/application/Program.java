package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		// upcasting - voce consegue instanciar os elementos da subclasse usando a variavel da super class
//		Account acc1 = new Account(1000, "Alex", 0.0);
//		Account acc2 = new BusinessAccount(1001, "Maria", 0.0, 500.0);
//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		
//		System.out.println(acc1.getBalance());
//		System.out.println(acc2.getBalance());
//		System.out.println(acc3.getBalance());
		
//		// DOWNCASTING - voce não consegue instanciar uma subclass em outra subclass
//		BusinessAccount acc4 = (BusinessAccount)acc2;
//		acc4.loan(100.0);
//		// BusinessAccount acc5 = (BusinessAccount)acc3;
//		if (acc3 instanceof BusinessAccount) {
//		BusinessAccount acc5 = (BusinessAccount)acc3;
//		acc5.loan(200.0);
//		System.out.println("Loan!");
//		}
//		if (acc3 instanceof SavingsAccount) {
//		SavingsAccount acc5 = (SavingsAccount)acc3;
//		acc5.updateBalance();
//		System.out.println("Update!");
//		}
		
		Account acc1 = new Account(1000, "Alex", 0.0);
		Account acc2 = new BusinessAccount(1001, "Maria", 0.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		acc1.deposit(1000.0);
		acc2.deposit(1000.0);
		acc3.deposit(1000.0);
		
		acc1.withdraw(200.0);
		acc2.withdraw(200.0);
		acc3.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
		System.out.println(acc3.getBalance());
		
		
	}

}
