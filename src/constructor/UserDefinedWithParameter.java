package constructor;

public class UserDefinedWithParameter 
{
	//variable declaration
	int a;
	int b;
	int c;
	String name;
	
	public UserDefinedWithParameter() // user defined without parameter
	{
		//initialize variable
		a=11;
		b=22;
		c=33;
	}
	
	public UserDefinedWithParameter(int x) //user defined constructor with single parameter
	{
		a=x;
		//b=default value=0
		//c=default value=0
	}
	
	public UserDefinedWithParameter(int x, int y)
	{
		a=x;
		b=y;
		//c=default value=0
		
	}
	public UserDefinedWithParameter(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	public static void main(String[] args) 
	{
		UserDefinedWithParameter u=new UserDefinedWithParameter();
		//created object user defined zero parameter constructor

		u.addition();
		
		UserDefinedWithParameter u1=new UserDefinedWithParameter(45);
		//created object user defined single parameter constructor
		u1.addition();
		
		UserDefinedWithParameter u2=new UserDefinedWithParameter(18, 17);
		// created object user defined two parameter constructor

		u2.addition();
		
		UserDefinedWithParameter u3=new UserDefinedWithParameter(45, 18, 10);
		// created object user defined three parameter constructor

		u3.addition();

	}
	public void addition() // Non-static method without parameter
	{
		int sum=a+b+c;
		System.out.println("sum is "+sum);
	}
      
}
