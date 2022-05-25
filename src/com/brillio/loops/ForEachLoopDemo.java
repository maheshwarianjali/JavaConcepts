package com.brillio.loops;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80,90,100 };
		
		// print value which are greater than or equal than 100
		for (int a  : numbers)
		{
			if (a>=50)
			{
				System.out.println(a);
			}
			
		}
		
	}

}
