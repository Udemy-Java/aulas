package aulas.secao4_sequencial;
/**
 *  Exercício de fixação - Aula 22
 */

import java.util.Locale;

public class exercicio22 {

	public static void main(String[] args) {
		
		String product1 = "Computer", product2 = "Office Desk";
		double price1 = 2100.00, price2 = 650.50, measure = 53.234567;
		int age = 30, code = 5290;
		char gender = 'F';
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %c %n", age, code, gender);
		
		System.out.printf("%nMeasure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
