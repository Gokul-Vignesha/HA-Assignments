package com.voya.runner;

import com.ha.volume.*;

public class VolumeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Volume obj1 = new Volume();
		
		
		System.out.println("Volume of Cuboid   : "   + obj1.volumeOfCuboid(20,20.5,65.20));
		System.out.println("Volume of Sphere   : "   + obj1.volumeOfSphere(15.5));
		System.out.println("Volume of Cylinder : " + obj1.volumeOfCylinder(15.5, 65.20));
		System.out.println("Volume of Cone     : "     + obj1.volumeOfCone(15.5, 65.20));
		
	}

}
