package quiz3;

import java.lang.*;

public class Triangle extends GeometricObject {

	// Data fields
	double side1;
	double side2;
	double side3;

	// No-arg constructor for default triangle
	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	// Constructor for specific triangle
	public void specificTriangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// Getters for sides
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	// returns area of triangle using Heron's formula
	@Override
	public double getArea() {
		return Math.sqrt((0.5*getPerimeter())*(0.5*getPerimeter()-this.side1)*
				(0.5*getPerimeter()-this.side2)*(0.5*getPerimeter()-this.side3));
	}

	// returns perimeter of triangle
	@Override
	public double getPerimeter() {
		return (this.side1+this.side2+this.side3);
	}
	
	// returns description of triangle
	@Override
	public String toString() {
		return "side1: " + this.side1 + "\nside2: " + this.side2 + "\nside3 :" +
	this.side3 + "\narea: " + getArea() + "\nperimeter: " + getPerimeter();
	}

}
