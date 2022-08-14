package stringStudy;

public class StringMethods {

	public static void main(String[] args) 
	{
		String s="HI"; //Created string without new keyword
		String s1= new String("HELLO"); //Created string with new keyword
		
	//Use Of Length Method
	System.out.println("Use Of Length Method");
		
	System.out.println(s.length());
	System.out.println(s1.length());
	
	int myLength = s1.length(); //this can be use multiple time
	System.out.println(myLength); 
	
	String s2="";
	System.out.println(s2.length());
	
	//String s3=null;
	//System.out.println(s3.length());
	
	System.out.println("**********************");
	
	//use of touppercase() method
	System.out.println("use of touppercase() method");
	
	String a="velocity";
	System.out.println(a);
	System.out.println(a.toUpperCase());
	
	String b = a.toUpperCase();
	System.out.println(b);
	
	System.out.println("**********************");
	
    // use of tolowercase() method
	
	System.out.println("use of tolowercase() method");
	String c="PANKAJ";
	System.out.println(c);
	System.out.println(c.toLowerCase());
	
	String d = c.toLowerCase();
	System.out.println(c.toLowerCase());
	
	System.out.println(b.toLowerCase());
	System.out.println("**********************");
	
	//use of equals() method
	System.out.println("use of equals() method");
	
	String v0="velocity";
	String v1="velocity";
	String v2= new String("velocity");
	String v3= new String("velocity");
	String v4= new String("Velocity");
	
	System.out.println(v0==v1);
	System.out.println(v1==v2);
	System.out.println(v2==v3);
	System.out.println("**********************");
	
	//case sensitive case
	System.out.println("case sensitive case");
	System.out.println(v0.equals(v1));
	System.out.println(v1.equals(v2));
	System.out.println(v2.equals(v3));
	System.out.println(v3.equals(v4));
	
	//equals ignore case --> not case sensitive
	
	System.out.println("equals ignore case");
	System.out.println(v3.equalsIgnoreCase(v4));
	System.out.println("*************************");
	
	//use of contains() method 
	System.out.println(" USE OF contains() METHOD");
	String e="velocity";
	System.out.println(e.contains("v"));
	System.out.println(e.contains("vlc"));
	System.out.println(e.contains("city"));
	System.out.println(e.contains("Vel"));
	System.out.println("**************************");
	
	// USE OF isEMPTY() METHOD-->BOOLEAN METHOD O/P IS IN TRUE OR FALSE
	System.out.println("USE OF isEMPTY() METHOD");
	
	String f0="Pune";
	String f1=" ";
	String f2=null;
	String f3="";
	
	System.out.println(f0.isEmpty());
	boolean result = f0.isEmpty();
	System.out.println(result);
	
	System.out.println(f1.isEmpty());
	//System.out.println(f2.isEmpty());-->null pointer exception
	System.out.println(f3.isEmpty());
	
	System.out.println("*****************************");
	
	// USE OF isBlank() METHOD
	System.out.println("USE OF isBlank() METHOD");
	
	System.out.println(f0.isBlank());
	System.out.println(f1.isBlank());
	//System.out.println(f2.isBlank());-->null pointer exception
	System.out.println(f3.isBlank());
	
	System.out.println("*****************************");
	
	// USE OF charAt METHOD
	System.out.println("USE OF charAt METHOD");
	
	String w="Thane";
	
	System.out.println(w.charAt(0));
	
	char ans = w.charAt(3);
	System.out.println(ans);
	
	//System.out.println(w.charAt(9));-->String Index Out Of Bounds Exception-->out of boundary
	//System.out.println(w.charAt(-1));-->String Index Out Of Bounds Exception
	System.out.println("*****************************");
	
	//USE OF endsWith() method--> sequence follow hona chahiye otherwise  ans will be false
	System.out.println("USE OF endsWith() method");
	
	String h= "abcd";
	System.out.println(h.endsWith("d"));
	System.out.println(h.endsWith("cbd"));
	System.out.println(h.endsWith("bcd"));
	System.out.println(h.endsWith("abcd"));
	
	System.out.println("*****************************");
	
	//USE OF startsWith() method
	System.out.println("USE OF startsWith() method");
	
	String y="India";
	System.out.println(y.startsWith("in"));
	System.out.println(y.startsWith("In"));
	System.out.println(y.startsWith("India"));
	
	System.out.println(y.startsWith("dia", 2));
	System.out.println(y.startsWith("dia", 3));
	
	System.out.println("*****************************");
	
	//USE OF subString() method
	System.out.println("USE OF subString() method");
	
	String m="Maharashtra";
	System.out.println(m.substring(4));
	
	String str = m.substring(2);
	System.out.println(str);
	
	System.out.println(m.substring(0, 4));
	
	System.out.println("*****************************");
	
	//USE OF indexOf() method
	System.out.println("USE OF indexOf() method");
	
	String t="Tea";
	int index = t.indexOf('T');
	System.out.println(index);
	
	String t1="India is my country which is 2nd biggest";
	System.out.println(t1.indexOf('n'));
	System.out.println(t1.lastIndexOf('i'));
	System.out.println(t1.indexOf('i', 24));
	
	System.out.println("*****************************");
	
	//USE OF replace() method
	System.out.println("USE OF replace() method");
	
	String m4="testing";
	
	System.out.println(m4.replace('t', 'P'));
	System.out.println(m4.replace("ing", ""));
	
	System.out.println("*****************************");
	
	//USE OF concat() method
	System.out.println("USE OF concat() method");
	
	String p1="Gov Of ";
	String p2="INDIA";
	
	System.out.println(p1.concat(p2));
	System.out.println(p1.concat("MAHARASHRA"));
	
	System.out.println("*****************************");
	
	}

}
