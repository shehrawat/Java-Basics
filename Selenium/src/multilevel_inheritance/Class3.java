package multilevel_inheritance;

public class Class3 extends Class2  //This is a Multilevel Inheritance
{
	void function5()
	{
		System.out.println("Function5");
	}
	
	void function6()
	{
		System.out.println("Function6");
	}

	public static void main(String[] args) 
	{
		Class3 obj = new Class3();
		obj.function1();
		obj.function2();
		obj.function3();
		obj.function4();
		obj.function5();
		obj.function6();

	}

}
