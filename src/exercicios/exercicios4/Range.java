package exercicios.exercicios4;

import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int qtd, min, max, in = 0, out = 0, valor;
		
		min = 10;
		max = 20;
		
		System.out.print("Informe quantos valores serão lidos:");
		qtd = sc.nextInt();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.printf("Digite o %dº valor", i);
			valor = sc.nextInt();
			if (valor >= min && valor <= max) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
