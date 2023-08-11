package collection;

import java.util.*;

public class Linkedlist {
	public static void main(String args[])
	{
		LinkedList obj=new LinkedList();
		obj.add(3);
		obj.add("Hallow");
		obj.add(7);
		obj.add("Hai");
		System.out.println(obj);
		
		obj.add(1,20);
		System.out.println(obj);
		
		obj.addFirst("flower");
		System.out.println(obj);
		
		obj.addLast("Lotus");
		System.out.println(obj);
		
		System.out.println(obj.indexOf("Hai"));
	
		System.out.println(obj.contains("Hai"));
		
		System.out.println(obj.peekLast());
		
		System.out.println(obj.peekFirst());
		System.out.println(obj);
		
		System.out.println(obj.pollFirst());
		System.out.println(obj);
		
		System.out.println(obj.pollLast());
		System.out.println(obj);
		
		obj.remove(2);
		System.out.println(obj);
		
		LinkedList obj1=new LinkedList();
		obj1.add("Java");
		obj1.add("Programming");
		obj1.add("Hello");
		
		obj.addAll(obj1);
		System.out.println(obj);
		
		obj1.removeAll(obj1);
		System.out.println(obj1);
		
		System.out.println(obj.get(2));
		
		System.out.println(obj.size());
		
		boolean Z=obj.contains("Java");
		System.out.println(Z);
		
		boolean Z=obj.contains("Vrindha");
		System.out.println(Z);
		
	}

}
