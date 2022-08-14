package access_Specifiers;

public class PrivateUse {

	public static void main(String[] args) 
	{
		PrivateUse pu=new PrivateUse(); //created object of class
		pu.test1(); //public can accessed within project
		pu.test2();//private can be accessed within class
		pu.test3();//default can be accessed within package
		pu.test4();//protected can be accessed within package/outside the package using interface
		

	}
	
	public void test1()
	{
		System.out.println("this is test1-public");//public can be accessed within project
	}
	
	private void test2()
	{
		System.out.println("this is test2-private");//private can be accessed within class
	}
	
	void test3()
	{
		System.out.println("this is test3-default");//default can be accessed within package
	}
	
	protected void test4()
	{
		System.out.println("this is test 4-protected");//protected can be accessed within package/outside the package using interface
	}

	
}
