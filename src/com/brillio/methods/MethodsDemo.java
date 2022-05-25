package com.brillio.methods;

import com.brillio.area.Area;

public class MethodsDemo {

	
	public static void main(String[] args) {
		
		int radius = 10;
		
		Area obj = new Area();// Calling Non-static Method, Creating Object of that Class
		
		double result = obj.areaOfCircle(10); // Example of calling Non Static Method
		System.out.println(result);
		
		
		//double result = Area.areaOfCircle(10); // Example of calling static Method
		//System.out.println(result);
		
		//result = Area.areaOfCircle(20); // Example of calling static Method
		//System.out.println(result);
		
		double output= Area.areaOfTriangle(10.2,12.2);
		System.out.println(output);
		
		String authorName = Area.getAuthorName();
		System.out.println(authorName);
		
		Area.printClassDescription();
	}
	

}
