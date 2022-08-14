package logicalPrograms;

public class ReverseNumberWithOutConvertingIntoString {

	public static void main(String[] args) 
	{
		int number=123;
		int revNum=0;
		
//		System.out.println(number/10); //division
//		System.out.println(number%10); //remainder
//		System.out.println(12/10);
//		System.out.println(12%10);
		
		for(int i=number;i>0;i=i/10) //123, 12, 1
		{
			int remainder = i%10; //3 2 1
			revNum=revNum*10+remainder;
			//    =0*10+3-->3
			//    =3*10+2-->32
			//    =32*10+1-->321
		}
		
		System.out.println(revNum);

	}

}
