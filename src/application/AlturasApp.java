package application;

import java.util.Scanner;

/**
 * @author flbju
 * 
 * Aula 87 - Vetores
 * Cria um programa para ler um valor 'n' e registrar os valores de 'n' alturas. 
 * Em seguida calcular a média.
 *
 */

public class AlturasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de valores a serem lidos: ");
		int n = sc.nextInt();
		
		double[] alturas = new double[n];
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			soma += alturas[i];
		}
		
		double media = soma / alturas.length;
		
		System.out.printf("%nMedia das alturas = %.2f metro(s).", media);
		
		sc.close();
	}

}
