package constructor;

public class MathOperations {
	
	int a;  // variable declaration
	int b;
	
	public MathOperations() //user defined constructor
	{
		//To initialize data member/variable
		System.out.println("Running user defined constructor");
		a=50;
		b=50;
	}
	public static void main(String[] args) 
	{
		MathOperations mo=new MathOperations();
		mo.add();

	}
     
	public void add()
	{
	//	a=20;  //assign value(initialization)
	//	b=30;
		int sum=a+b;
		System.out.println("sum is "+sum);
				
	}
}
