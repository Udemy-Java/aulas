package application;

import java.util.Scanner;
import entities.Employee;

public class EmnployeeApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + emp);
		
		sc.close();
		
	}

}
