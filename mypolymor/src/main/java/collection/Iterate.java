package collection;

import java.util.*;

public class Iterate {

	public static void main(String[] args) {
		
ArrayList<Integer>obj=new ArrayList<Integer>();
obj.add(6);
obj.add(8);
obj.add(3);
obj.add(2);
obj.add(4);
Iterator itr=  obj. iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

itr.remove();//remove the last index element
System.out.println(obj);
	}

}
