package com.healthasyst.area;

public class Area {

	public static double areaOfCircle(int r) {
		return Math.PI * Math.pow(r,2);
	}

	
	public static double areaOfTriangle(double base,double height) {
		  return (base * height)/2 ;
	}
	
	
	public static double areaOfReactangle(double length, double breadth) {
		return length * breadth;
	}

	
	public static double areaOfSquare(double side) {
		return side * side ;
	}
	
	public static double areaOfTrapezium(double a , double b , double h) {
		double area = (h*(a+b))/2 ;
		return area ;
	}
	
	
}
