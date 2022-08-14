package thisAndSuperKeyword;

//use 4 --> this keyword can be use to pass an argument in the method call

public class Use_Of_this_Keyword_4 
{
	void m1(Use_Of_this_Keyword_4 td)
	{
		System.out.println("i in method m1");
	}
	void m2()
	{
		m1(this);
	}
	

	public static void main(String[] args) 
	{
		Use_Of_this_Keyword_4 td=new Use_Of_this_Keyword_4();
		td.m2();
	}

}
