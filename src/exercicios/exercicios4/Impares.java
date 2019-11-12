package exercicios.exercicios4;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		do {
		System.out.print("Digite um valor inteiro entre 1 e 1000:");
		valor = sc.nextInt();
		} while (valor < 1 || valor > 1000);
		
		mostraImpares(valor);
		
		sc.close();
	}
	
	public static void mostraImpares(int valor) {
		for (int i = 1; i <= valor; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}	
		}
	}
}