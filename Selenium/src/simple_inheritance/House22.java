package simple_inheritance;

public class House22 extends House11 //This is a Simple Inheritance
{

	void car1(String x)
	{
		System.out.println("This is a String Car1 Function");
	}

	void car1(int y)
	{
		System.out.println("This is a Single Integer Car1 Function2");
	}
	

	public static void main(String[] args) 
	{
		House22 sss = new House22();  //This is a Case1
		House11 obj = new House11();  //This is a Case2
		sss.car1(0, 0);
		sss.car1(null);
		sss.car1(0);   //We can call House11's functions with House22's object not with House11's object 
		obj.car1(9);
		House11 vvv = new House22(); //This is a Case3 for Function Overriding
		vvv.car1(0);

	}

}
