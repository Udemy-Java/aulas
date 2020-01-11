package application;

import java.util.Scanner;

import entities.Student;

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		
		System.out.print("Name: ");
		s.setName(sc.nextLine());
		
		System.out.print("Grade 1: ");
		s.setGrade1(sc.nextDouble());
		
		System.out.print("Grade 2: ");
		s.setGrade2(sc.nextDouble());
		
		System.out.print("Grade 3: ");
		s.setGrade3(sc.nextDouble());
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", s.finalGrade());
		System.out.println(s.status());
		
		sc.close();

	}

}
