package multiple_inheritance;

public class Simple extends Abstract implements Interface //This is a Multiple Inheritance
{
	public void car()
	{
		System.out.println("This is a Simple Function");
	}
	
	public void bike()
	{
		System.out.println("This is a Both Abstract and Interface Function");
	}

	public static void main(String[] args) 
	{
		Simple obj = new Simple();
		obj.car();
		obj.car(0);
		obj.bike();

	}

}

//Functions in Simple class whose name same as Abstract class and Interface's class function should be public'