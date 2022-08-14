package thisAndSuperKeyword;

//this() method use to invoke current class constructor

public class Use_Of_this_Keyword_3 
{
	Use_Of_this_Keyword_3() //constructor
	{	
		this(10);
		System.out.println("no argument constructor");
	}
	Use_Of_this_Keyword_3(int a)
	{	
		
		System.out.println("Parameterize constructor");
	}

	public static void main(String[] args) 
	{
		Use_Of_this_Keyword_3 td=new Use_Of_this_Keyword_3();
		

	}

}
