package com.brillio.loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i = 100;
		
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		
		do	// it will execute atleast once
		{
			System.out.println(i);
			i++;
		}while (i<=5);
		
	}

}
