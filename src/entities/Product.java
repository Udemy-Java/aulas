package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.setName(name);
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.setName(name);
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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
		return this.getName().toUpperCase() + ", " + this.quantity + " units, Total: $"
				+ String.format("%.2f", this.totalValueInStock());
	}
}
