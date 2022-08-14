package controlStaments;

public class ElseIfStudy {

	public static void main(String[] args) {
		//if I got >=90 I am in dist
		//else if i got >=66 and <90 I am in 1st class
		//else if i got >=50 and <66 I am in 2nd class
		//else if i got >=40 and <50 I am in pass class  
		//else I am fail
		
		int marks=91;
		if(marks>=90)
		{
			System.out.println("I am in dist");
		}
		else if (marks>66 & marks<90) 
		{
			System.out.println("I am in 1st class");
			
		}
		else if (marks>=50 & marks<66) 
		{
		      System.out.println("I am in 2nd class");	
		}
		else if (marks>=40 & marks<50) 
		{
		      System.out.println("I am in pass class");	
		}
		else {
			System.out.println("I am fail");
		}

	}

}
