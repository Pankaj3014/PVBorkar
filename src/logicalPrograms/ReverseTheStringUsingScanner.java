package logicalPrograms;

import java.util.Scanner;

public class ReverseTheStringUsingScanner {

	public static void main(String[] args) 
	{
		//String o="Pankaj";
		
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String r="";
		
		for(int i=o.length()-1;i>=0;i--) //6 5 4
		{
			r=r+o.charAt(i);
			//j=""+j
			//ja=j+a
			//jak=ja+k
		}
		System.out.println("Reverse String is "+r);
		
		

	}

}
