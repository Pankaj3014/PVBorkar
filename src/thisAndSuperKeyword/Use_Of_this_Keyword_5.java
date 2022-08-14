package thisAndSuperKeyword;

//use5--> this keyword can be used to pass as an argument in constructor call

class Test
{
	Test(Use_Of_this_Keyword_5 td)
	{
		System.out.println("test class constructor");
	}
}

public class Use_Of_this_Keyword_5 
{
	void m1()
	{
		Test t=new Test(this);
	}
	
	public static void main(String[] args) 
	{
		Use_Of_this_Keyword_5 td=new Use_Of_this_Keyword_5();
		td.m1();
	}

}