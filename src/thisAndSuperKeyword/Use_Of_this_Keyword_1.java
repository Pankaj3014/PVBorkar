package thisAndSuperKeyword;

//Use1--> this keyword use to invoke current class instance variable

public class Use_Of_this_Keyword_1 
{
	int i;
	void SetValue(int i)
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		Use_Of_this_Keyword_1 td= new Use_Of_this_Keyword_1();
		td.SetValue(100);
		td.show();
		
	}
	

	

	

}
