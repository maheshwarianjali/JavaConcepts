package com.brillio.loops;

public class LoopsConcept {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20 , 30 , 40 , 50 , 60 ,70};
		// 0 t0 6
		for ( int i = 0;i<=6 ; i++ )
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println(numbers.length);
		
		for ( int i = 0;i<numbers.length ; i++ )// Alternate way
		{
			System.out.println(numbers[i]);
		}
		
	}

}
