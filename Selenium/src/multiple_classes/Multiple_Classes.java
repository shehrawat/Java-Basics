package multiple_classes;

public class Multiple_Classes 
{
	void function1()
	{
		System.out.println("This is Function1");
	}
	
	void function2()
	{
		System.out.println("This is Function2");
	}
	
	void function3()
	{
		System.out.println("This is Function3");
	}

	public static void main(String[] args) 
	{
		Multiple_Classes obj = new Multiple_Classes();
		obj.function1();
		obj.function2();
		obj.function3();

	}

}

class Multiple2
{
	void function4()
	{
		System.out.println("This is Function4");
	}

	void function5()
	{
		System.out.println("This is Function5");
	}

	void function6()
	{
		System.out.println("This is Function6");
	}

	public static void main(String str[])
	{
		Multiple2 val = new Multiple2();
		val.function4();
		val.function5();
		val.function6();
		
	}
}

