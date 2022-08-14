package logicalPrograms;

public class PallindromeStudy {

	public static void main(String[] args) 
	{
		String o="NITIN";
		String r="";
		
		for(int i=o.length()-1;i>=0;i--) 
		{
			r=r+o.charAt(i);
		}
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
