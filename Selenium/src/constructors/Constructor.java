package constructors;

public class Constructor extends Super_Constructor
{
	Constructor(int x)
	{
		this();
		System.out.println("This is Parameterized Constructor");
	}
	
	Constructor()
	{
		super();
		System.out.println("This is Non Parameterized Constructor");
	}


	public static void main(String[] args) 
	{	
		Constructor obj = new Constructor(5);

	}

}
