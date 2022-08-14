package variableTypes;

public class GlobalAndLocalVariables {
	//non-static global variable
	int a=90;  //1+2 declaration+assign values
	
	//static global variable
	static int b=10;  //1+2 declaration + assign
	

	public static void main(String[] args) 
	{
		GlobalAndLocalVariables g=new GlobalAndLocalVariables();
		g.test(); //calling non static method from same class
		test1(); //callingstatic method from same classs
		System.out.println("gloabal value of a is "+g.a); //calling non-static global variable from same class
		System.out.println("global value of b is "+b); //calling static global variable from same class
		
		int sum=10+g.a; //usage of non static global variable from same class
		int sub=100-b;  //usage of static global variable from same class
		
		Sample s= new Sample();// created object of another class
		System.out.println("value of non -static global variable from another class is "+s.p);
		//calling static global variable form another class
		System.out.println("value of static global variable from another class is "+Sample.q);

	}
	
	public void test()
	{
		int a=80; //local variable
		int sum=a+100;
		System.out.println("sum is : "+sum);
	}
	
	public static void test1()
	{
		//static int b=800;
		int a=1000;
		System.out.println("Running static test1 method");
	}

}
