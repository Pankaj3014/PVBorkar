package patternPrograms;

public class Ex12 {

	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*

		//rows-->9  in row 1-->star=5

		int star=1;

		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				star++;
			}
			else
			{
				star--;
			}

			System.out.println();
		}



	}

}
