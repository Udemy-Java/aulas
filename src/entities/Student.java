package entities;

public class Student {
	
	public double grade1, grade2, grade3;
	public String name;
	
	public double finalGrade() {
		return (this.grade1 + this.grade2 + this.grade3);
	}
	
	public String status() {
		if (finalGrade() >= 60) {
			return "PASS";
		} else {
			return "FAILED \n" + "MISSING " + String.format("%.2f", 60 - finalGrade()) + " points.";
		}
	}

}
