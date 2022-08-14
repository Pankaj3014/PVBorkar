package methods;

public class universityStudents {

	public static void main(String[] args) 
	{
		universityStudents us=new universityStudents(); // created object of a class
		us.studentInfo();  //calling non static method from same class
		
		us.studentInfo("Apeksha", "PU789", "Enggineering", "Civil", 'F', 2019, 55.5f);
		us.studentInfo("Radha", "ABC456", "Vrundavan", "Gavlan", 'F', 3256, 49.9f);

	}
      public void studentInfo()  // method without parameter
      {
    	  String name;
    	  name="Panakj";
    	  
    	  String PRN;
    	  PRN="PU12345";
    		
    	 String BRANCH;
    	 BRANCH="Engg";
    	 
    	 String department;
    	 department="Civil";
    	 
    	 char gender;
    	 gender='M';
    	 
    	 int passOutYear;
    	 passOutYear=2019;
    	 
    	 float weight;
    	 weight=68.3f;
    	 
    	 
    	 System.out.println("==================================================");
    	 System.out.println("My name is "+name);
    	 System.out.println("My PRN numberis "+PRN);
    	 System.out.println("My branch is "+BRANCH);
    	 System.out.println("My department is "+department);
    	 System.out.println("My gender is  "+gender);
    	 System.out.println("My passout year is "+passOutYear);
    	 System.out.println("My weight is "+weight);
    	 System.out.println("==================================================");
    	 
      }
      
      public void studentInfo(String name, String PRN, String BRANCH, String department,  char gender, int passOutYear,  float weight   )
      {
    	  System.out.println("==================================================");
     	 System.out.println("My name is "+name);
     	 System.out.println("My PRN numberis "+PRN);
     	 System.out.println("My branch is "+BRANCH);
     	 System.out.println("My department is "+department);
     	 System.out.println("My gender is  "+gender);
     	 System.out.println("My passout year is "+passOutYear);
     	 System.out.println("My weight is "+weight);
     	 System.out.println("==================================================");
      }
}
