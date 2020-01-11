package entities;

public class Student {
	
	private double grade1, grade2, grade3;
	private String name;
	
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

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getGrade3() {
		return grade3;
	}

	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
