package entities;

public class Employee {
	
	private String name;
	private double grossSalary, tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double perc) {
		this.grossSalary *= 1 + (perc /100);
	}
	
	public String toString() {
		return name.trim().toUpperCase() + ", $ " + String.format("%.2f", this.netSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
