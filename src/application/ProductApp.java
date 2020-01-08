package application;

import java.util.Scanner;

import entities.Product;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
// Sem indicar quantity utiliza o construtor sobrecarregado
//		System.out.print("Quantity in stock: ");
//		int quantity = sc.nextInt();
		System.out.println();

		entities.Product p = new Product(name, price);
		
		System.out.println("Product data: " + p);
		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		System.out.println();

		System.out.println("Updated data: " + p);
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt());
		System.out.println();

		System.out.println("Updated data: " + p);
		
		p.setName("Computer");
		System.out.println("Updated name: " + p.getName());
		
		p.setPrice(1200);
		System.out.println("Updated price: " + p.getPrice());

		sc.close();
	}

}
