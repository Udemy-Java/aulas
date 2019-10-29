package exercicios.exercicios1;

import java.util.Scanner;

public class AreaCirculo {

	/**
	 * Exercício 2:
	Faça um programa para ler o valor do raio de um círculo, 
	e depois mostrar o valor da área deste círculo com quatro casas decimais. 
	Fórmula da área: area = π . raio^2 
	Considere o valor de π = 3.14159
	**/
	
	public static void main(String[] args) {
		
		double raio, area, pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2); 
				
		System.out.printf("AREA = %.2f%n", area);
		
		sc.close();
	}
}