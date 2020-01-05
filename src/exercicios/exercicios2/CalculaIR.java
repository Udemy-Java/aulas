package exercicios.exercicios2;

import java.util.Scanner;

public class CalculaIR {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		double salario, imposto, 
		aliquota1, aliquota2, aliquota3,
		faixa1, faixa2, faixa3;
		
		aliquota1 = 0.08;
		aliquota2 = 0.18;
		aliquota3 = 0.28;
		
		faixa1 = 2000.00;
		faixa2 = 3000.00;
		faixa3 = 4500.00;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário: R$ ");
		salario = sc.nextDouble();
		
		if (salario <= faixa1) {
			System.out.println("Isento");
		} else if (salario <= faixa2) {
			System.out.printf("Imposto = %.2f%n", (salario - faixa1) * aliquota1);
		} else if (salario <= faixa3) {
			System.out.printf("Imposto = R$ %.2f%n", (salario - faixa2) * aliquota2
					+ (faixa2 - faixa1) * aliquota1);
		} else {
			System.out.printf("Imposto = R$ %.2f%n", (salario - faixa3) * aliquota3
					+ (faixa3 - faixa2) * aliquota2
					+ (faixa2 - faixa1) * aliquota1);
		}

		sc.close();
		
	}
	
}