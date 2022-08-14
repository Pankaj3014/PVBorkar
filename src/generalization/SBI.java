package generalization;

public class SBI implements RBI 
{
	@Override
	public void deposit() 
	{
		System.out.println("SBI deposit Intrest Rate-->5%");
	}

	@Override
	public void loan() 
	{
		System.out.println("SBI loan Intrest Rate-->8%");
	}

	@Override
	public void transfer() 
	{
		System.out.println("SBI have NEFT, IMPS, RTGS");
	}
	
	public void YONO()
	{
		System.out.println("SBI's own method");
	}
	

}
