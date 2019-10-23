/**
 * Aula 24 - Entrada de dados de usuário
 */
import java.util.Scanner;

public class aula24 {

	public static void main(String[] args) {
		// Lendo uma string:
		System.out.printf("Digite uma string: ");
		Scanner scstr = new Scanner(System.in);
		
		String xstring = scstr.next();
		
		System.out.println(xstring);
		
		// Lendo um inteiro:
		System.out.printf("Digite um número inteiro: ");
		Scanner scint = new Scanner(System.in);
		
		int xint = scint.nextInt();
		
		System.out.println("Número digitado = " + xint);
		
		scint.close();
		
	}

}
