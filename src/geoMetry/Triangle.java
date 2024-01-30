package geoMetry;

public class Triangle extends Shape {
	
	private double sideLengthA;
	private double sideLengthB;
	private double sideLengthC;
	private double height;
	
	
	public Triangle(double xCords, double yCords, double sideLengthA, double sideLengthB, double sideLengthC,
			double height) {
		super(xCords, yCords);
		this.sideLengthA = sideLengthA;
		this.sideLengthB = sideLengthB;
		this.sideLengthC = sideLengthC;
		this.height = height;
	}


	public double getSideLengthA() {
		return sideLengthA;
	}


	public void setSideLengthA(double sideLengthA) {
		this.sideLengthA = sideLengthA;
	}


	public double getSideLengthB() {
		return sideLengthB;
	}


	public void setSideLengthB(double sideLengthB) {
		this.sideLengthB = sideLengthB;
	}


	public double getSideLengthC() {
		return sideLengthC;
	}


	public void setSideLengthC(double sideLengthC) {
		this.sideLengthC = sideLengthC;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * calculates area of the triangle
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (sideLengthA * height) /2;
	}


	/**
	 * calculates circumference of the triangle
	 */
	@Override
	public double calculateCircumference() {
		// TODO Auto-generated method stub
		return sideLengthA + sideLengthB + sideLengthC;
	}
	
	
	
	
	
	

}
