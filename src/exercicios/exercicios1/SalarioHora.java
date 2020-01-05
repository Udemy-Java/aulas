package exercicios.exercicios1;

import java.util.Scanner;

public class SalarioHora {

	/**
	 * Exercício 4
	 * Fazer um programa que leia: 
		- o número de um funcionário, 
		- seu número de horas trabalhadas, 
		- o valor que recebe por hora 
		e calcula o salário desse funcionário.
		A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
	 **/
	
	public static void main(String[] args) {
		
		int matricula, horas;
		double valor_hora, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número do funcionário: ");
		matricula = sc.nextInt();
		
		System.out.print("Horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.print("Valor da hora de trabalho: R$ ");
		valor_hora = sc.nextInt();
		
		salario = valor_hora * horas;
		
		System.out.printf("Salário do Funcionário %d = R$ %.2f", matricula, salario);
		
		sc.close();
	}
}