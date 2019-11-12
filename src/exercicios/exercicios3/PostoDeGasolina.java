package exercicios.exercicios3;

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int op, 
		gasolina = 0, 
		alcool = 0, 
		diesel = 0;

		do {
			menu();
			
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				gasolina += 1;
				break;
			case 2:
				alcool += 1;
				break;
			case 3:
				diesel += 1;
				break;
			case 4:
				break;
			default:
				System.out.println("Código inválido.");
				break;
			}
		} while (op != 4);

		System.out.println("Muito Obrigado!");
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Álcool: " + alcool);
		System.out.println("Diesel: " + diesel);

		sc.close();

	}

	public static void menu() {
		System.out.println("Escolha o combustível:");
		System.out.println("1 - Gasolina");
		System.out.println("2 - Álcool");
		System.out.println("3 - Diesel");
		System.out.println("4 - Terminar");
	}
	
}
