package exercicios.exercicios4;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos, peso1, peso2, peso3;
		
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		
		double v1, v2, v3, media;
		
		System.out.print("Informe o número de casos: ");
		casos = sc.nextInt();
		
		for (int i =1; i <= casos; i++) {
			
			System.out.printf("1º valor: ");
			v1 = sc.nextDouble();
			
			System.out.printf("2º valor: ");
			v2 = sc.nextDouble();
			
			System.out.printf("3º valor: ");
			v3 = sc.nextDouble();
			
			media = (v1 * peso1 + v2 * peso2 + v3 * peso3) / (peso1 + peso2 + peso3);
			
			System.out.printf("Média ponderada de %dº caso: %.1f%n",i , media);
		}
		
		sc.close();

	}

}
