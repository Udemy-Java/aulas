package application;

import java.util.Scanner;

import entities.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Enter the rectangle width and height:");
		r.a = sc.nextDouble();
		r.b = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERIMETER = %.2f%n", r.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		sc.close();

	}

}
