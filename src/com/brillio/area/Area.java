package com.brillio.area;

public class Area {
	
	//public static double areaOfCircle(int r) // Example of static Method
	{
	//	double area = 3.14 * r * r ;
	//	return area;
	}
	
	public double areaOfCircle(int r) // Example of Non-static method
	{
		double area = 3.14 * r * r ;
		return area;
	}
	
	public static double areaOfTriangle(double base, double height)
	{
		return (base * height) / 2;
	}
	
	public static String getAuthorName()
	{
		String name = " Anjali Maheshwari";
		return name;
	}
	
	public static void printClassDescription()
	{
		//System.out.println(Testing);
	}
}
