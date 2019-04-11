package import_class;

import import_class.House1; //Import House1 Class into House2

public class House2 
{
	void function3()
	{
		System.out.println("This is a Function3");
	}
	
	public static void function4()
	{
		System.out.println("This is a Function4");
	}
	
	protected void function5()
	{
		System.out.println("This is Protected function");
	}
	public static void main(String[] args) 
	{
		House2 val = new House2();
		val.function3();
		val.function4();
		val.function5();
		House1.function1(); //Call House1 class function and we cannot call House1's class function with House2's class object

	}

}

//If we want to call a function in same package but in different class without Inheritance there is some steps :-
//1-make a function public static
//2-import first class into second class
//3-call a function with its class name like=House.function1();