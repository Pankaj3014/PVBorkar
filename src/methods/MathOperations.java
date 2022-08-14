package methods;

public class MathOperations {

	public static void main(String[] args) 
	
	{
	MathOperations m= new MathOperations(); // created object of a class
	m.add(); // calling non static method with the help of object
	sub(); // calling static method 

	}
    
	public void add() // non static regular method
	{
		
		int a;
		int b;
		int addition;
		a=10;
		b=20;
		addition=a+b;
		System.out.println("addition is "+addition);
		
	}
	
	public static void sub()  // static regular method
	{
		int a;
		int b;
		int subs;
		a=90;
		b=30;
		subs=a-b;
		
		System.out.println("subtraction is "+subs);
		
	}
}
