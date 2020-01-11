package application;

import java.util.Scanner;
import entities.Employee;

public class EmnployeeApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.setName(sc.nextLine());
		
		System.out.print("Gross salary: ");
		emp.setGrossSalary(sc.nextDouble());
		
		System.out.print("Tax: ");
		emp.setTax(sc.nextDouble());
		
		System.out.println();
		System.out.println(emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		emp.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + emp);
		
		sc.close();
		
	}

}
