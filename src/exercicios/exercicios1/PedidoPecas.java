package exercicios.exercicios1;

import java.util.Scanner;

public class PedidoPecas {
	
/**
 *  Exercício 5:
 *  Fazer um programa para ler:
	no código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
	no código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
	Calcule e mostre o valor a ser pago.
 **/
	
	public static void main(String[] args) {
		
		int quantidade;
		double valorUnitario, valorTotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** SISTEMA DE PEDIDOS **");
		
		for(int i = 1; i < 3; i++) {
			
				System.out.printf("\nCódigo da peça %d: ", i);
				sc.nextInt();
		
				System.out.printf("Número de peças %d: ", i);
				quantidade = sc.nextInt();
		
				System.out.printf("Digite o valor da peça %d: R$ ", i);
				valorUnitario = sc.nextDouble();
				
				valorTotal = valorTotal + valorUnitario * quantidade;
		}
		
		System.out.printf("\nVALOR TOTAL = R$ %.2f", valorTotal);
		
		sc.close();
	}

}