package exercicios.exercicios4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite um número inteiro para calculcar seu fatorial: ");
		int n = sc.nextInt();
		
		System.out.printf("%d! = %d.%n", n, fatorial(n));
		
		sc.close();
	}
	
	public static int fatorial(int n) {
		for (int i = n; i > 1; i--) {
			n = n * (i - 1);
		}
		
		if (n == 0) {
			return 1;
		}
		
		return n;
	}
}