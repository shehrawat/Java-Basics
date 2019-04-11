package constructors;

public class Super_Constructor 
{
	Super_Constructor()
	{
		this(5);
		System.out.println("This is Non Parameterized Super Constructor");
	}
	
	Super_Constructor(int x)
	{
		System.out.println("This is Parameterized Super Constructor");
	}


	public static void main(String[] args) 
	{

	}

}
