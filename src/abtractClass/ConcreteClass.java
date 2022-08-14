package abtractClass;

public class ConcreteClass extends A {

	public static void main(String[] args) 
	{
		ConcreteClass c=new ConcreteClass(); //created object of concrete class
		
		c.demo1();
		c.demo2();
		
		c.demo3();
		c.sample();

	}

	@Override
	public void demo3() 
	{
		System.out.println("Demo 3 completed in concrete class");
		
	}
	
	public void sample()
	{
		System.out.println("this is own method of concrete class");
	}

}
