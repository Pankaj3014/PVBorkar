package collectionStudy;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add("Pune");
		hs.add(true);
		hs.add(123);
		hs.add(99.99);
		hs.add(123);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println("================================");
		
		System.out.println(hs.size());
		System.out.println(hs.contains(null));
		System.out.println(hs.equals("Pune"));
		System.out.println(hs.remove(true));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.clone());
		
		System.out.println("================================");
		
		

	}

}
