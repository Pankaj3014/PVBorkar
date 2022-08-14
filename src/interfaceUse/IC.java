package interfaceUse;

public class IC implements MyInterface {

	public static void main(String[] args) 
	{
		IC i=new IC();  
		i.test1();
		i.test2();
		i.test3();
		
		

	}

	@Override
	public void test1() 
	{
		System.out.println("Test1 method completed in Implementation class");
		
	}

	@Override
	public void test2() 
	{
		System.out.println("Test2 method completed in Implementation class");
		
	}
	
	public void test3() 
	{
		System.out.println("Test3 is own method of IC");
		
	}

}
