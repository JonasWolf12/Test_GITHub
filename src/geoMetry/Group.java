package geoMetry;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	double total = 0;
	
	
	/**
	 * calculates total area of all the shapes
	 * @return total Area
	 */
	public double calculateTotalAreaOfAllShapes() {
		for(Shape s : this.shapes ) {
			total += s.calculateArea();
		}
		return total;
	}
			

	/**
	 * calculates total circumference of all the shapes
	 * @return total circumference
	 */
	public double calculateCircumferenceOfAllShapes() {
		for(Shape s : this.shapes) {
			total += s.calculateCircumference();
		}
		return total;
	}
	
	
	/**
	 * finds the largest shape based on the area
	 * @return the largest shape
	 */
	public Shape findingTheLargestShape() {
		Shape maxShape = this.shapes.get(0);
		for(Shape s : this.shapes) {
			if(maxShape.calculateArea() < s.calculateArea()) {
				maxShape = s;
			}
		}
		return maxShape;
	}
	
	/**
	 * all Objects gets put out
	 */
	public void outputOfAllObjects() {
		for ( Shape s : this.shapes) {
			System.out.println(s);
		}
	}


	
}
