package exercicios.exercicios3;

import java.util.Scanner;
import exercicios.exercicios2.PlanoCartesiano;

public class Coordenadas {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Informe a coordenada X: ");
			x = sc.nextInt();
			
			System.out.print("Informe a coordenada Y: ");
			y = sc.nextDouble();
			
			PlanoCartesiano.Cartesiano(x, y);
			
		} while (x != 0 || y != 0); 
		
		sc.close();

	}

}
