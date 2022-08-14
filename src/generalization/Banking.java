package generalization;

public class Banking {

	public static void main(String[] args) 
	{
		SBI s=new SBI();
		BOI b=new BOI();
		AxisBank a=new AxisBank();
		
		//RBI.minBalance=minBalance+700;-->final value so we cant change the variable
	
		s.deposit();
		s.loan();
		s.transfer();
		s.YONO();
		System.out.println("...........................................");
		
		b.deposit();
		b.loan();
		b.transfer();
		b.BOIstarApp();
		System.out.println("...........................................");
		
		a.deposit();
		a.loan();
		a.transfer();
		a.AxisApp();
	}

}
