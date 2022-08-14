package thisAndSuperKeyword;

// use2--> this keyword can be use to invoke current class method
public class Use_Of_this_Keyword_2 
{
	void display()
	{
		System.out.println("hello");
	}
	void show()
	{
		display();
	}
	

	public static void main(String[] args) 
	{
		Use_Of_this_Keyword_2 td=new Use_Of_this_Keyword_2();
		//td.display();
		td.show();

	}

}
// if you dont use this keyword compiler automatically adds this keyword while invoking method