package access_Specifiers;

public class Demo {

	public static void main(String[] args) 
	{
		PrivateUse p=new PrivateUse();//created object of another class
		p.test1();//calling public test1 method
		//p.test2();//private method can be called only within same class
		p.test3();//default method can be accessed within package
		p.test4();//protected method can be accessed within package and outside package with inheritance
		

	}

}
