package protectedPackage;

import access_Specifiers.PrivateUse;

public class Sample extends PrivateUse 
{

	public static void main(String[] args) 
	{
		PrivateUse p=new PrivateUse();
		p.test1(); //we can call public method in another package
		
		//to call protected method we need to create object of sub class
		
		Sample s=new Sample();
		
		s.test1(); //calling superclass public method using subclass object
		s.test4(); //calling superclass protected method using subclass object

	}

}
