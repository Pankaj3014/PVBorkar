package logicalPrograms;

import java.util.Scanner;

public class PallindromeStudyScanner {

	public static void main(String[] args) 
	{
		//String o="NITIN";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name ");
		
		String o = sc.next();
		
		String r="";
		
		for(int i=o.length()-1;i>=0;i--) 
		{
			r=r+o.charAt(i);
		}
		System.out.println("original string is "+o);
		System.out.println("Reverse of the given string is:"+r);
		
		if(o.equals(r))
		{
			System.out.println("Given string is pallindrome");
		}
		else
		{
			System.out.println("Given string is not pallindrome");
		}

	}

}
