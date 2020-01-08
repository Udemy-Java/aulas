package entities;

public class Rectangle {
	
	public double a, b;
	
	public double area() {
		return this.a * this.b;
	}
	
	public double perimeter() {
		return (this.a + this.b) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
	}
}
