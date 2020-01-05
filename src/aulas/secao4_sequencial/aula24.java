package aulas.secao4_sequencial;
/**
 * Aula 24 - Entrada de dados de usuário
 */
import java.util.Scanner;

public class aula24 {

	public static void main(String[] args) {
		// Lendo uma string:
		System.out.printf("Digite uma string: ");
		
		// Cria um novo objeto do tipo Scanner associado à entrada padrão do console:
		Scanner sc = new Scanner(System.in);
		
		// O médodo next() aceita apenas 1 argumento sem espaços.
		String xstring = sc.next();
		
		System.out.println(xstring);
		
		// Lendo um inteiro:
		System.out.printf("Digite um número inteiro: ");
		
		// O método nextInt() aceita apenas 1 argumento tipo inteiro.
		int xint = sc.nextInt();
		
		System.out.println("Número digitado = " + xint);
		
		sc.close();
		
	}

}
