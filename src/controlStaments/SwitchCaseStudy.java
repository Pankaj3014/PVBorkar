package controlStaments;

public class SwitchCaseStudy {

	public static void main(String[] args) 
	{
		// if year is 1--> Welcome to 1st year Engg
		// if year is 2--> Welcome to 2nd year Engg
		// if year is 3--> Welcome to 3rd year Engg
		// if year is 4--> Welcome to 4th year Engg
		// if not within 1-4--> Plz enter valid year between 1-4
		
		int Year=4;
		
		switch (Year) 
		{
		case 1: System.out.println("Welcome to 1st year Engg");
		break;
			
		case 2: System.out.println("Welcome to 2nd year Engg");
		break;
		
		case 3: System.out.println("Welcome to 3rd year Engg");
		break;
		
		case 4: System.out.println("Welcome to 4th year Engg");
		break;

		default: System.out.println("Plz enter valid year between 1-4");
		break;
		}

	}

}
