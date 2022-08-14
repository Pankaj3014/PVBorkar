package logicalPrograms;

import java.util.Scanner;

public class WhiteSpacesFromString {

	public static void main(String[] args) 
	{
		//P a n ka j
		
		
		String s="p an k aj";
		
		int counter=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			
			if(blank==' ')
			{
				counter++;
			}
		}
		System.out.println("number of blnk spaces in "+s+" is "+counter);

	}

}
