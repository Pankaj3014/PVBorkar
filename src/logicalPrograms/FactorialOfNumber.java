package logicalPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		//4!=4*3*2*1=24
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please Enter the nummber:");
//		
//		int number = sc.nextInt();
		
		int number =4;
		
		
		int fact=1;
		
		for(int i=number;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+" is "+fact);

	}

}
