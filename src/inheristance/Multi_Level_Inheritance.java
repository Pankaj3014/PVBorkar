package inheristance;

public class Multi_Level_Inheritance {

	public static void main(String[] args) 
	{
		Son s=new Son(); //created object of son class
		
		s.recepie(); //using son class calling grandmothers method
		s.nature(); //using son class calling mothers method
		s.mobile(); //using son class calling sons(own) method
		
		Son.stories(); //using son class calling grandmothers static method
		Son.look(); //using son class calling mothers static method
		Son.laptop(); //using son class calling sons(own) static method
		
		

	}

}
