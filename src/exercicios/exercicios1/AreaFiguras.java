package exercicios.exercicios1;

import java.util.Scanner;

public class AreaFiguras {

	/**
	 * Exercício 6:
	 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
	mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B.
	 **/

	public static void main(String[] args) {
		
		double a, b, c, pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de 'a': ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de 'b': ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de 'c': ");
		c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.2f%n", a * c / 2);
		System.out.printf("CIRCULO: %.2f%n", pi * Math.pow(c, 2));
		System.out.printf("TRAPEZIO: %.2f%n", (a + b)/2 * c);
		System.out.printf("QUADRADO: %.2f%n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.2f%n", a * b);
		
		sc.close();
	}

}