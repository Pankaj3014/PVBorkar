package controlStaments;

public class NestedIfElse {

	public static void main(String[] args) 
	{
		//If username correct then enter password
		//If password is correct then login successful
		//else password is wrong--> Plz enter valid password
		//else username is wrong--> plz enter valid usename
		
		String username="Pankaj";
		String password="Pankaj@123";
		
		if (username=="Pankaj") 
		{
			System.out.println("Correct username, plz enter password ");
			
			if (password=="Pankaj@123") 
			{
			      System.out.println("Correct password, Login Successfully");	
			}
			else 
			{
                  System.out.println("invalid password, login failed");
			}
		}
		else
		{
			System.out.println("Invalid username, Plz enter valid Username");
		}
		

	}

}
