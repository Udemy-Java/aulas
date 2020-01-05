package exercicios.exercicios1;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		// Exercício 3
		
		int a, b, c, d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ex 2.3 - Fazer um programa para ler quatro valores inteiros A, B, C e D.\n" + 
				"A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:\n" + 
				"DIFERENCA = (A * B - C * D).");
		System.out.println("Digite 4 valores inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.printf("DIFERENCA = %d", (a * b) - (c * d));
		
		sc.close();

	}
}
