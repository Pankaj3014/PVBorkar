package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(); //created object of array list
		
		al.add("Velocity");
		al.add(199);
		al.add(99.99);
		al.add(null);
		al.add(null);
		al.add("Velocity");
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		System.out.println(al.indexOf(199));
		System.out.println(al.lastIndexOf("Velocity"));
		System.out.println(al.contains("Velocity"));
		System.out.println(al.remove(0)); //index basis
		System.out.println(al);
		al.add(1, "Pune"); //-->specified index la add krte
		System.out.println(al);
		System.out.println(al.remove(null)); //element basis
		System.out.println(al);
		
		System.out.println("=============================");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("=============================");
		
		// printing element using for loop
		
		//static or hard coding
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("=============================");
		
		//dynamic coding
		
		for(int i=0; i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=============================");
		
		// for each loop
		
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("=============================");
		
		// Iterator and List Iterator
		//Iterator--> is a method and interface also
		
		//iterator
		System.out.println("iterator ouput");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=============================");
		
		//List Iterator
		System.out.println("ListIterator ouput");
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("=============================");

	}

}
