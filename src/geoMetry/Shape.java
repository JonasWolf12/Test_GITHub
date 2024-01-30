package geoMetry;

public abstract class Shape {
	
	private double xCords;
	private double yCords;
	
	public Shape(double xCords, double yCords) {
		super();
		this.xCords = xCords;
		this.yCords = yCords;
	}
	
	
	
	public double getxCords() {
		return xCords;
	}



	public void setxCords(double xCords) {
		this.xCords = xCords;
	}



	public double getyCords() {
		return yCords;
	}



	public void setyCords(double yCords) {
		this.yCords = yCords;
	}


	/**
	 * calculates area 
	 */
	public abstract double calculateArea();
	
	
	/**
	 * calculates circumference 
	 */
	public abstract double calculateCircumference();
}
