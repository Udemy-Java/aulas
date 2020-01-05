package exercicios.exercicios3;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		int senha, entrada;
		
		senha = 2002;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite a senha: ");
			entrada = sc.nextInt();
			if (senha == entrada) {
				System.out.println("Acesso permitido.");
			} else {
				System.out.println("Senha inválida.");
			}
		} while(senha != entrada);
		
		sc.close();

	}

}
