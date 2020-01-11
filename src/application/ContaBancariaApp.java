package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class ContaBancariaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ContaBancaria conta;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String cliente = sc.nextLine();
			
		System.out.print("Is there an initial deposity (y/n)? ");
		char op = sc.next().charAt(0);
		if (op == 'y' | op == 'Y') {
			System.out.print("Enter initial deposit value: $ ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numeroConta, cliente, depositoInicial);
		} else {
			conta = new ContaBancaria(numeroConta, cliente);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		conta.deposito(sc.nextDouble());
		
		System.out.println("Updated account Data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Updated account Data:");
		System.out.println(conta);
		
		sc.close();
	}
}