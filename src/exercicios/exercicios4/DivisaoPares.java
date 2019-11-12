package exercicios.exercicios4;

import java.util.Scanner;

public class DivisaoPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtd;
		
		double divisor, dividendo;
		
		System.out.print("Informe o número de casos: ");
		qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			System.out.print("Informe o dividendo: ");
			dividendo = sc.nextDouble();
			
			System.out.print("Informe o divisor: ");
			divisor = sc.nextDouble();
			
			if (divisor == 0) {
				System.out.println("Divisao Impossível");
			} else {
				System.out.printf("Quociente = %.1f%n", dividendo / divisor);
			}
		}
		
		sc.close();

	}

}
