package arrayStudy;

public class ArrayUsingLoop {

	public static void main(String[] args)
{
		//Step1-->Array Declaration
		
				String city[]=new String[8];
				
				//Step2-->Array Initialize
				
				city[0]="Pune";
				city[1]="Thane";
				city[2]="Dhule";
				city[3]="Beed";
				city[4]="Goa";
				city[5]="Mumbai";
				city[6]="Nagpur";
				city[7]="Talodhi";
				
				//Step3--> Usage
				System.out.println(city[0]); 
				System.out.println(city[1]);
				System.out.println(city[2]);
				System.out.println(city[3]);
				System.out.println(city[4]);
				
				System.out.println("________________________________");
				
				for(int i=0; i<=4; i++)
				{
					System.out.println(city[i]);
				}
				System.out.println("________________________________");
				
				for(int i=4; i>=0; i--)
				{
					System.out.println(city[i]);
				}
				System.out.println("________________________________");
				
				for(int i=0; i<=city.length-1; i++)
				{
					System.out.println(city[i]);
				}
				System.out.println("________________________________");
				
				for(int i=city.length-1; i>=0; i--)
				{
					System.out.println(city[i]);
				}
				System.out.println("________________________________");


 }

}
