package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Father f=new Father();
		Son s=new Son();
		
		f.bike();
		f.car();
		
		System.out.println("---------------------------");
		
		s.bike();
		s.car();
		s.degree();
		
		System.out.println("---------------------------");
		
	//up casting process--> call only common methods in both class
	//the property which is newly created is not applicable for up casting
		
		Father f1=new Son();
		
		f1.bike();
		f1.car();
	//f1.degree();-->not applicable for up casting
		

	}

}
