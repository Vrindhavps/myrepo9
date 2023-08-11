package mypolymor;

public class Car implements Vehicle,Bus {
	public void show()
	{
		System.out.println("Driver");
	}
public void display()
{
	System.out.print("method in class");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car sc=new Car();
sc.show();
Bus ac=new Bus();//interface obj
sc.display();
	}

}
