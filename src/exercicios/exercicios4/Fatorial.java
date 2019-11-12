package exercicios.exercicios4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		fatorial(n);
		
		sc.close();
	}
	
	public static int fatorial(int n) {
		for (int i = 0; i < n; i--) {
			n *= n - 1; 
		}
	}
}
