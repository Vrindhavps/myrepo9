package mypolymor;

public class Aggregation2 {
String housename;
int pin;
Aggregation obj;
Aggregation2(String housename,int pin,Aggregation obj)
{
	this.housename=housename;
	this.pin=pin;
	this.obj=obj;
	
	
}
public void show()
{
	System.out.println(housename+""+pin);
	System.out.println(obj.name+""+obj.age);
	
}
public static void main(String args[])
{
	Aggregation obj1=new Aggregation("Ravi",32);
	
	
	Aggregation2 a2=new Aggregation2("Deepam", 695102,obj1);
	
	a2.show();
	
}
}
