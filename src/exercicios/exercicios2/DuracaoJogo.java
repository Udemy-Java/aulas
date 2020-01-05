package exercicios.exercicios2;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, termino, duracao;
		
		System.out.print("Digite a hora de início: ");
		inicio = sc.nextInt();
		
		System.out.print("Digite a hora de término: ");
		termino = sc.nextInt();
		
		duracao = (termino > inicio) ? termino - inicio : 24 - inicio + termino;
		
		System.out.println("Duracao do jogo = " + duracao + " horas.");
		
		sc.close();

	}

}
