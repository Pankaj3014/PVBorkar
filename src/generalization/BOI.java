package generalization;

public class BOI implements RBI 
{

	@Override
	public void deposit() 
	{
		System.out.println("BOI deposit Intrest Rate-->5.8%");
	}

	@Override
	public void loan()
	{
		System.out.println("BOI loan Intrest Rate-->8.5%");
	}

	@Override
	public void transfer() 
	{
		System.out.println("SBI have NEFT, IMPS, RTGS, CDM");
	}
	
	public void BOIstarApp()
	{
		System.out.println("BOI's own method");
	}

}
