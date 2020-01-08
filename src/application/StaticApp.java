package application;

import java.util.Scanner;
import util.Calculator;

public class StaticApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		System.out.printf("Pi = %.2f", Calculator.PI);
		
		sc.close();

	}

}
