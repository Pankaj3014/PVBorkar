package inheristance;

public class Single_Level_Inheristance {

	public static void main(String[] args) 
	{
		Mother m=new Mother(); // created object of mother class
		
		Son s=new Son(); // created object of son class
		
		m.nature(); //using mothers object calling mothers method
		
		s.mobile(); //using sons object calling sons method
		
		s.nature(); //using sons object calling mothers method
		
		
		Mother.look(); //mother class calling its own static method
		
		Son.laptop(); //son calling its own static method
		
		Son.look(); //son calling mothers static method
		

	}

}
