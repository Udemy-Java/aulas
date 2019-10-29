package aulas.secao4_sequencial;
/**
 * Aula 23 - Processamento de dados em Java, Casting
 */

public class aula23 {

	public static void main(String[] args) {
		// Exemplo 1 - tipo int//
		int x1, y1;
				
		x1 = 5;
		y1 = 2 * x1;
		
		System.out.println("X1 = " + x1);
		System.out.println("Y1 = " + y1);
		
		// Exemplo 2 - tipo double//
		int x2;
		double y2;
		
		x2 = 5;
		
		y2 = 2 * x2;
		
		System.out.println("X2 = " + x2);
		System.out.println("Y2 = " + y2);
		
		// Exemplo3 - área do trapézio
		double b, B, h, area;
		
		b = 6.0; // Boa prátca: indicar o tipo de dado na declaração (.0 para tipo double e 'f' para float)
		B = 8.0;
		h = 5.0;
		
		area = (B + b)/2 * h;
		
		System.out.println("Area do trapézio = " + area);
		
		// Exemplo 4 - Casting
		int x4, y4;
		double res;
		
		x4 = 2;
		y4 = 5;
		
		// Sem casting o resultado é truncado:
		res = y4 / x4;
		System.out.println("Resultado sem casting: " + res);
		
		// Com casting o resultado mantém a precisão:
		res = (double) y4 / x4;
		System.out.println("Resultado com casting: " + res);
		
	}

}
