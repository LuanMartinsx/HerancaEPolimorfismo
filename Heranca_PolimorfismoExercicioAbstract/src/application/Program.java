package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Tax payer #" + (i+1) +  " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");	
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalEntity(name, annualIncome, numberOfEmployees));
				
			} else {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
			}
			
		}
		
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(Person p : list) {
			double tax = p.taxes();
			System.out.println(p.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
	
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
