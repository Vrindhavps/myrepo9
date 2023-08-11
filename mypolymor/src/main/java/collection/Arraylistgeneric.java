package collection;

import java.util.ArrayList;

public class Arraylistgeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Dyan");
		obj.add("Vrindha");
		obj.add("Amal");
		obj.add("Hellow");
		System.out.println(obj);//add();
		
		//obj.remove(2);
		//System.out.println(obj);//remove();
		
		ArrayList<String>obj1=new ArrayList<String>();
		obj1.add("Hello");
		obj1.add("Java");
		obj1.add("Programme");
		
		obj.addAll(obj1);
		System.out.println(obj);//addAll();
		
		ArrayList<String>obj2=new ArrayList<String>();
		obj2.add("hai");
		obj2.add("Mobile");
		obj2.removeAll(obj2);
		System.out.println(obj2);//removeAll();
		
		System.out.println(obj.get(2));//get the element get()
		
		System.out.println(obj.size());//size of the elements stored size()
		
		boolean Z=obj.contains("Vrindha");//contains true statement
		System.out.println(Z);
		
		boolean A=obj.contains("Manual");//contains false statement
		System.out.println(A);
		
		
		

	}

}
