package logicalPrograms;

public class MultiplicationWithOutMutiplicationOperator {

	public static void main(String[] args) 
	{
		//2*3=6
		//2+2+2 or 3+3 =6
		
		int num1=2;
		int num2=3;
		
		int sum=0;
		
		for(int i=1;i<=num2;i++) //1,2,3,4
		{
			sum=sum+num1; 
			//i-->1-->sum=2=0+2
			//i-->2-->sum=4=2+2
			//i-->3-->sum=6=4+2
		}
		
		System.out.println("multiplication is "+sum);

	}

}
