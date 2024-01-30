package geoMetry;

public class Circle extends Shape {
	
	
	private double radius;
	
	
	public Circle(double xCords, double yCords, double radius) {
		super(xCords,yCords);
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	/**
	 * calculates area of the circle
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return  Math.pow(radius, 2)  * Math.PI;
	}

	
	/**
	 * 
	 * calculates circumference of the triangle
	 */
	@Override
	public double calculateCircumference() {
		// TODO Auto-generated method stub
		return 2 * this.radius * Math.PI;
	}
	
	
	
	
	

}
