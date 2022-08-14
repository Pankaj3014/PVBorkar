package logicalPrograms;

import java.util.Scanner;

public class UserInputScannerClass2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter your name : ");
		
		String name = sc.next();
		
		System.out.println("Your name is "+name);
		

	}

}
