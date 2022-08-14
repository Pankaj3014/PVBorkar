package logicalPrograms;

public class PrimeNumberOrNot {

	public static void main(String[] args) 
	{
		int num=12;
		int counter=0;
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
		}
		if(counter==0) //if(counter==1) we can use like this also
		{
			System.out.println("Given number is Prime number");
		}
		else
		{
			System.out.println("Given number is not Prime number");
		}

	}

}
