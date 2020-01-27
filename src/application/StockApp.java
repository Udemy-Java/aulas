package application;

import java.util.Scanner;
import entities.Product;

public class StockApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		System.out.print("Quantity: ");
		int n = sc.nextInt();
				
		Product[] Estoque = new Product[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Name product " + (i + 1) + " ");
			sc.next();
			String name = sc.nextLine();
			
			System.out.print("Price product " + (i + 1) + " $ ");
			double price = sc.nextDouble();
			
			Product p = new Product(name , price);
			Estoque[i] = p;
			soma += p.getPrice();
			
			System.out.println();
		}
		
		double media = soma / Estoque.length;
		
		System.out.printf("Average price = $ %.2f", media);
		
		sc.close();

	}

}
