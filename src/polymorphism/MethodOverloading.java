package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		
		mo.add();
		mo.add(10);
		mo.add(30,90);
		
	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	
	public void add(int a)
	{
		a=30;
		int sum=a+10;
		System.out.println("sum is "+sum);
		
	}
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}

}
