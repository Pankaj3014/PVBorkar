package logicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		int a=10;
		int b=3;
		
		System.out.println(a/b); //Division
		System.out.println(a%b); //remainder --> modular operator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int number = sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}

	}

}
