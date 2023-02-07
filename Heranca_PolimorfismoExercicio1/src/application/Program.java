package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n  = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value Per Hours: ");
			double valuePerHours = sc.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				double adicionalCharge = sc.nextDouble();
				OutsourceEmployee out = new OutsourceEmployee(name, hours, valuePerHours, adicionalCharge);
				list.add(out);
			} else {
				
				Employee emp = new Employee(name, hours, valuePerHours);
				list.add(emp);
			}
			
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
