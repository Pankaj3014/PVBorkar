package arrayStudy;

public class ArrayUse_DataType {

	public static void main(String[] args) 
	{
		//I want to store city name
		
		//Step1-->Array Declaration
		
		String city[]=new String[5];
		
		//Step2-->Array Initialize
		
		city[0]="Pune";
		city[1]="Thane";
		city[2]="Dhule";
		city[3]="Beed";
		city[4]="Goa";
		//city[5]="kkkkk";
		
		//Step3--> Usage
		System.out.println(city[4]);
		
		System.out.println("________________________________");
		
		//Step1-->Array Declaration
		int count[]=new int[3];
		//Step2-->Array Initialize
		count[0]=10;
		count[1]=11;
		count[2]=12;
		//Step3--> Usage
		System.out.println(count[1]);
		System.out.println("________________________________");
		
		//Step1-->Array Declaration
		float weight[]=new float[5];
		//Step2-->Array Initialize
		weight[1]=15.5f;
		weight[2]=67.69f;
		System.out.println(weight[2]);
		System.out.println("________________________________");
		
		double height[]=new double[3];
		height[0]=75.69;
		height[1]=69.25;
		height[2]=25.36;
		System.out.println(height[1]);
		System.out.println("________________________________");
		
		boolean result[]=new boolean[2];
		result[0]=true;
		result[1]=false;
		System.out.println(result[0]);
		System.out.println("________________________________");
		
		char grade[]=new char[10];
		grade[0]='A';
		grade[1]='B';
		System.out.println(grade[0]);
		System.out.println("________________________________");
		

	}

}
