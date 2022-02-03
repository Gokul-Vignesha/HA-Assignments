package com.ha.volume;

public class Volume {

	public double volumeOfSphere(double radius ) { 
		return (4/3) * (Math.PI * Math.pow(radius, 3));
	}
	
	public double volumeOfCylinder(double radius, double height) {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	public double volumeOfCone(double radius, double height) {
		return (Math.PI * Math.pow(radius, 2) * height) / 3;
	}

	public double volumeOfCuboid(double length, double width, double height) {
		return length * width * height;
	}
	
	
}	
	
	
