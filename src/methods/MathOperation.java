package methods;

public class MathOperation {

	public static void main(String[] args) 
	{
		MathOperation m=new MathOperation(); //created object of a class
		m.add();
		m.add(14, 05);
		m.add(30, 11);
		
		sub();
		sub(100, 300, 900);
		sub(900, 300, 100);

	}
	
	public void add()  // non static regular method--> without parameter/zero parameter
	{
		int a;
		int b;
		int addition;
		a=20;
		b=30;
		addition=a+b;
		System.out.println("sum is "+addition);
		
	}
	
	public void add(int a, int b) // method with parameter
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	
	public static void sub()  //static regular method-->without/zero parameter
	{
		int a;
		int b;
		int subs;
		a=0;
		b=10;
		subs=a-b;
		System.out.println("sub is "+subs);
		}
	
	public static void sub(int p, int q, int r)   //method with parameter
	{
		int subs=p-q-r;
		System.out.println("subtraction is "+subs);
	}

}
