package exercicios.exercicios1;

import java.util.Scanner;

public class SomaInteiros {

	/**
	 * Exercício 2:	
	 * Faça um programa para ler dois valores inteiros, 
	 * e depois mostrar na tela a soma desses números com uma mensagem explicativa
	 **/
	
	public static void main(String[] args) {
		
		int x, y, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um inteiro: ");
		x = sc.nextInt();
		
		System.out.print("Digite outro inteiro: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}
}