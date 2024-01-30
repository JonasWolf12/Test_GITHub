package geoMetry;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public Rectangle(double xCords, double yCords, double length, double width) {
		super(xCords, yCords);
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	@Override
	public double calculateCircumference() {
		// TODO Auto-generated method stub
		return 2*(this.length + this.width);
	}
	
	
}	
	
