package generalization;

public class AxisBank implements RBI 
{

	@Override
	public void deposit() 
	{
		System.out.println("Axis deposit Intrest Rate-->9.8%");
	}

	@Override
	public void loan() 
	{
		System.out.println("Axis loan Intrest Rate-->9.5%");
	}

	@Override
	public void transfer() 
	{
		System.out.println("SBI have NEFT, IMPS, RTGS, CDM, Personal Assistance");
	}
	
	public void AxisApp()
	{
		System.out.println("Axis own method");
	}

}
