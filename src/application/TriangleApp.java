package application;

import java.util.Scanner;
import entities.Triangle;

public class TriangleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		
		System.out.println("Enter the measures of triangle Y: ");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area of X = %.2f%n", areaX);
		System.out.printf("Area of Y = %.2f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}

}
