package exercicios.exercicios2;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		/**
		 * Exercício 2
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		/** Resolução com if/else 
		  if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		*/
		
		// Resolução com expressão ternária
		String resto = ( numero % 2 == 0 ) ? "PAR" : "ÍMPAR";

		System.out.println(resto);
		
		sc.close();
	}
}