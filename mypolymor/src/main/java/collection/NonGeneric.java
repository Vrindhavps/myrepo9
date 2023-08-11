package collection;

import java.util.*;

//import java.util.ArrayList;
//import java.util.Iterator;


public class NonGeneric {
	public static void main(String args[])
	{
		ArrayList obj=new ArrayList();
		obj.add(7);
		obj.add("Hello");
		obj.add(8);
		obj.add("Hai");
		obj.add(6.0f);
		/*Iterator itr=obj.iterator();
		while(itr.hasNext())
				 {
			System.out.println(itr.next());
			
			
			
		
	}*/
System.out.println(obj.indexOf(7));
System.out.println(obj.contains("hai"));
System.out.println(obj.remove("Hai"));

System.out.println(obj.addAll());



}
}