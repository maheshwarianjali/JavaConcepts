package com.brillio.print;

public class Demo3Array {

	public static void main(String[] args) {
		// 30 , 40 , 50 , 60 ,70
		int[] numbers = new int[5]; // 5*32 bits of memory
		
		numbers[0]=30;
		numbers[1]=40;
		numbers[2]=50;
		numbers[3]=60;
		//numbers[4]=70;
		System.out.println(numbers); // memory will be allocated in RAM
		System.out.println(numbers[4]);// default value 0 will be loaded
		System.out.println(numbers[3]);
		
		double[] x = new double[3];// 3 * 64 bits of memory 
		x[0]=45.6;
		x[1]=78.3;
		x[2]=90.5;
				
		System.out.println(x[1]+ x[2]);
		System.out.println(x[2]);
		
		int[] arr1= {20,30,40,50} ;// Alternate way of declaring array
		System.out.println(arr1[1]);
		
		//for storing red, green , yellow
		String[] arr2= {"Red", "Green" , "Yellow"};// 14*16bits of memory
		System.out.println(arr2[0]);
		
		String[] arr3 = new String[3];// Alternate way
		arr3[0]= "Red";
		arr3[1]= "Yellow";
		System.out.println(arr3[2]);
				
	}
	

}
