package thisAndSuperKeyword;

public class ThisUse {
	
	int a=100; //non-static global variable
	int b=500;

	public static void main(String[] args) 
	{
		ThisUse tu=new ThisUse();
		tu.test();

	}
	
	public void test()
	{
		int a=20; //local variable
		int sum=a+150; //here a's value is local value
		System.out.println(sum);
		
		int sum1=this.a+150; //here a's value is global variable
		System.out.println(sum1);
	}

}
