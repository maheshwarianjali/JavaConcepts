package com.brillio.print;

public class Area {

	public static void main(String[] args) {
		float squareside= 40.2f;
		float squarearea= squareside * squareside;
				System.out.println("Area of Square = " + squarearea);
				
		byte h = 5;
		byte a= 2;
		double b =3;
		double trapeziumarea = ((a+b)*h)/2;
		System.out.println("Area of Trapezium = " + trapeziumarea);
		
		double sphereradius = 25.6;
		double volumesphere = (4*22*sphereradius*sphereradius*sphereradius)/(3*7);
		System.out.println("Volume of Sphere = " + volumesphere );
				
		String name = "anjali"; // 6 * 16 bits of memory. In string, name stores character by character
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(0));
		
		

	}

}
