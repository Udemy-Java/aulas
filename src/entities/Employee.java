package entities;

public class Employee {
	
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double perc) {
		this.grossSalary *= 1 + (perc /100);
	}
	
	public String toString() {
		return name.trim().toUpperCase() + ", $ " + String.format("%.2f", this.netSalary());
	}
}
