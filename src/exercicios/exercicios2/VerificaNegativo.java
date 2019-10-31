package exercicios.exercicios2;

import java.util.Scanner;

public class VerificaNegativo {

	public static void main(String[] args) {
		/**
		 * Exercício 1
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro (positivo ou negativo): ");
		int numero = sc.nextInt();
		
		/** Resolução com if/else:
		 * 
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		*/
		
		// Resolução com expressão ternária:
		String res = ( numero < 0) ? "NEGATIVO" : "POSITIVO";
		
		System.out.println(res);
		
		sc.close();

	}

}
