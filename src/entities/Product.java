package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int qtd) {
		this.quantity += qtd;
	}

	public void removeProducts(int qtd) {
		this.quantity -= qtd;
	}

	public String toString() {
		return this.name.toUpperCase() + ", " + this.quantity + " units, Total: $"
				+ String.format("%.2f", this.totalValueInStock());
	}

}
