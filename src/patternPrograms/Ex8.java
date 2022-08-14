package patternPrograms;

public class Ex8 {

	public static void main(String[] args) 
	{
		//   *
		//  ***
		// *****
		//*******
		
		//rows-->4 in row 1--> star=1 space=3
		
		int space=3;
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			star=star+2;
			space--;
			System.out.println();
		}

	}

}
