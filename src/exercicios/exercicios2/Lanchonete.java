package exercicios.exercicios2;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		/**Exercício 5
		 * Com base na tabela, escreva um programa que leia o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 */
		
		byte pedido;
		
		double quantidade;
		
		Scanner sc = new Scanner(System.in);
		
		imprimeCardapio();
	
		System.out.print("Escolha um item: ");
		pedido = sc.nextByte();
				
		System.out.print("Informe a quantidade: ");
		quantidade = sc.nextByte();
		
		switch (pedido) {
		case 1:
			System.out.printf("Total = R$ %.2f", quantidade * 4);
			break;
		case 2:
			System.out.printf("Total = R$ %.2f", quantidade * 4.5);
			break;
		case 3:
			System.out.printf("Total = R$ %.2f", quantidade * 5);
			break;
		case 4:
			System.out.printf("Total = R$ %.2f", quantidade * 2);
			break;
		case 5:
			System.out.printf("Total = R$ %.2f", quantidade * 1.5);
			break;
		default:
			System.out.println("Item não encontrado no cardápio");
			break;
		}
		
		sc.close();
		
	}

	public static void imprimeCardapio() {
		
		String[] item = {"Cachorro-quente", "X-Salada\t", "X-Bacon\t\t", "Torrada Simples", "Refrigerante\t"};
		double[] preco = {4, 4.5, 5, 2, 1.5};
		
		System.out.println("*************** CARDÁPIO ***************");
		System.out.printf("CODIGO \t ESPECIFICACAO \t\t PREÇO\n");
		for (int i = 0; i < item.length; i++) { 
				System.out.printf("%d\t%s \tR$ %.2f%n", i+1, item[i], preco[i]);
		}
		System.out.println("*************** CARDÁPIO ***************");
	}
}
