package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class CambioApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a taxa de câmbio: ");
		double cambio = sc.nextDouble();
		
		System.out.print("Informe o valor em US$: ");
		double usd = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em R$: %.2f", CurrencyConverter.dolarReal(cambio, usd));
		
		sc.close();
		
	}

}
