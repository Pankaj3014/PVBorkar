package constructor;

public class Test 
{
		// public Test()
		// {
		// default constructor--> compiler will create at time of compilation 
	//}
	
	public Test() // user defined constructor-->without/zero parameter
	{
       		System.out.println("This user defined constructor");
		
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test(); //created object of class
	}

}
