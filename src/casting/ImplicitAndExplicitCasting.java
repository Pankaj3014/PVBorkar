package casting;

public class ImplicitAndExplicitCasting {

	public static void main(String[] args) 
	{
		//Implicit Casting--> converting higher data type into lower data type
		int a=10;
		System.out.println(a);
		
		double b=a;
		System.out.println(b);
		
		System.out.println("*********");
		
		//Explicit Casting--> converting lower data type into higher data type
		
		double c=123.1234;
		System.out.println(c);
		
		int d=(int) c;
		System.out.println(d);
	}

}
