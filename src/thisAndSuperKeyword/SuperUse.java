package thisAndSuperKeyword;

public class SuperUse extends A 
{
	
	int m=10; //global variable from superUse

	public static void main(String[] args) 
	{
		SuperUse su=new SuperUse();
		su.test();
	}
	
	public void test()
	{
		int m=1;
		
		int sum=m+10; //using local value of m
		
		int sum1=this.m+10; //using global value of m from same class
		
		int sum2=super.m+10; //using global value of m from super class
		
		
		System.out.println("using local value of m "+sum);
		
		System.out.println("using global value m of same class "+sum1);
		
		System.out.println("using global value m of super class "+sum2);
	}

}
