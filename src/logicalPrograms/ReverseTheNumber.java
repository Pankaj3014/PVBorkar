package logicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) 
	{
		// 1234-->4321
		
		int number=1234;
		
		//converting integer into string
		
		String s = Integer.toString(number);
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		
		//now converting string to integer
		int revNumber = Integer.parseInt(r);
		
		System.out.println("orginal number is "+number);
		System.out.println("reverse number is "+revNumber);

	}

}
