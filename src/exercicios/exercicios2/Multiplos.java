package exercicios.exercicios2;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		/** Exercício 3
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
		 * múltiplos entre si. 
		 * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		 */
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		String res = ( a % b == 0 || b % a == 0 ) ? "São múltiplos." : "Não são múltiplos.";
		
		System.out.println(res);
	
		sc.close();
	}

}