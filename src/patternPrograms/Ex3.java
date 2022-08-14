package patternPrograms;

public class Ex3 {

	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		//*****
		
		//rows-->5 column min-->1, star=1;
		
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}

	}

}
