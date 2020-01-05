package exercicios.exercicios2;

import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		/** Exercício 7
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		 * de um ponto em um plano. 
		 * A seguir, determine qual o quadrante ao qual pertence o
		 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		 * 
		 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
		 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		 */
		
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de 'x': ");
		x = sc.nextDouble();
		
		System.out.print("Digite o valor de 'y': ");
		y = sc.nextDouble();
		
		Cartesiano(x, y);

		sc.close();
	}

public static void Cartesiano(double x, double y) {
		// Solução
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		
		} else {
			System.out.println("Q4");
		}
	}
}