package aulas.secao4_sequencial;
import java.util.Locale;

public class aula21 {

	public static void main(String[] args) {

		// Atribuição de variável - tipo byte = -128 a 127 //
		byte idade = 37;
		
		// Usando código Unicode para caracteres //
		char inicial = '\u0046';

		System.out.printf("Idade = %d%n"
				+ "Inicial = %c%n", 
				+ idade, inicial);
		
		// Trabalhando com ponto flutuante //
		double pi = 3.141517;
		
		// Função println: separador decimal = '.' //
		System.out.println("Pi = " + pi);
		
		// Função printf: separador decimal = ',' de acordo com as configurações de codificação do ambiente//
		System.out.printf("Pi = %.2f%n", pi);

		// Usando a função Locale.setdefault é possível escolher a codificação utilizada //
		Locale.setDefault(Locale.US);;
		System.out.printf("Pi = %.2f%n", pi);
		
	}

}
