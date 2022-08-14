package loopsStudy;

public class WhileLoopStudy {

	public static void main(String[] args) 
	{
		// I want 4 table
		// initialization--> 4
		// condition------->i<=40
		// updation--------> i=i+4
		
		//initialization
		int i=4;
		
		while(i<=40) // condition//4,8,12,36,40,44
		{
			System.out.println(i); //4,8,12....36,40
			i=i+4; //updation //8,12.....36,40,44
		}
		
		System.out.println("=========");
		
		// I want 4 table in reverse order
		// initialization--> 40
		// condition------->a>=4
		// updation--------> a=a-4
		
		int a=40;
		
		while(a>=4)
		{
			System.out.println(a);
			a=a-4;
		}
	}

}
