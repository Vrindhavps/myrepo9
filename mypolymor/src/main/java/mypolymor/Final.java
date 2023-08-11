package mypolymor;

public class Final {
 final int a=2;
  public void show()
  {
  a=5;
	  System.out.println(a);
  }
	public static void main(String args[])
	{
		Final sc=new Final();
		  sc.show();
	}

}
