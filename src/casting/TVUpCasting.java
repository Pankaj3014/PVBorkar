package casting;

public class TVUpCasting extends TVsmart
{

	public static void main(String[] args) 
	{
		TV t1=new TV();
		t1.onida();
		t1.antina();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		TVsmart t2=new TVsmart();
		t2.onida();
		t2.antina();
		t2.PlayStore();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		TV t3=new TVsmart();
		t3.onida();
		t3.antina();
		

	}

}
