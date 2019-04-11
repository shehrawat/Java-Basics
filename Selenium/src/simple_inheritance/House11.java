package simple_inheritance;

public class House11 
{
	void car1(int x, int y)
	{
		System.out.println("This is a Double Integer Car1 Function");
	}
	                    //This is a Function Overloading
	void car1(int y)
	{
		System.out.println("This is a Single Integer car1 Function");
	}
		
	public static void main(String[] args) 
	{
		House11 aaa = new House11();
		aaa.car1(2,5);
		aaa.car1(4);

	}

}
