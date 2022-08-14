package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector v=new Vector<>(); //objected created of vector class
		
		v.add(123);
		v.add("Pune");
		v.add('D');
		v.add(null);
		v.add(null);
		v.add(123);
		v.add(true);
		v.add(123.234);
		System.out.println(v);
		
		System.out.println(v.size());
		
		v.add(0, "Velocity");
		System.out.println(v);
		
		System.out.println(v.contains("Pune"));
		
		v.remove(0);
		System.out.println(v);
		
		System.out.println("=====================================================");
		
		//for loop
		System.out.println("For Loop");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("=====================================================");
		
		//for each loop
		System.out.println("for each loop");
		
		for(Object a:v)
		{
			System.out.println(a);
		}
		System.out.println("=====================================================");
		
		//iterator
		System.out.println("iterator");
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================================================");
		
		//ListIterator
		System.out.println("ListIterator");
		
		ListIterator li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("=====================================================");
		
		//Enumeration
		System.out.println("Enumeration");
		
		Enumeration ele = v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		
		System.out.println("=====================================================");

	}

}
