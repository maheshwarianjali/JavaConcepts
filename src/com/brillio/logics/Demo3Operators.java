package com.brillio.logics;

public class Demo3Operators {

	public static void main(String[] args) {
		
		int mark = 75;
		if (mark>=90)
		{
			System.out.println("Grade : A");
		}
		else if (mark >=80 && mark <=89)
		{
			System.out.println("Grade : B");
		}
		else if (mark >=60 && mark <=79)
		{
			System.out.println("Grade : C");
		}
		else if (mark >=45 && mark <=59)
		{
			System.out.println("Grade : D");
		}
		else
		{
			System.out.println("Grade : F");
		}
	}
}
