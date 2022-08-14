package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList1 {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		ll.add("Pune");
		ll.add('A');
		ll.add(123);
		ll.add(123.12);
		ll.add(true);
		ll.add(123);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		
		System.out.println("==============================");
		//for loop
		System.out.println("FOR LOOP");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("==============================");
		
		// for each loop
		System.out.println("for each loop");
		
		for(Object a:ll)
		{
			System.out.println(a);
		}
		System.out.println("==============================");
		
		//iterator
		System.out.println("iterator");
		
		Iterator it = ll.iterator();
		
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		System.out.println("==============================");
		
		//ListIterator
		System.out.println("ListIterator");
		
		ListIterator li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("==============================");

	}

}
