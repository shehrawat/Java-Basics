package static_nonstatic;

import import_class.House1;
import import_class.House2;

public class House3 extends House2
{
	void function6()
	{
		System.out.println("This is a Function6");
	}
	
	void function7()
	{
		System.out.println("This is a Function7");
	}

	public static void main(String[] args)
	{
		House3 abc = new House3();
		abc.function6();
		abc.function7();
		House1.function1();  //Call a function of House1 class
		House2.function4();  //Call a function of House2 class
		abc.function5();     //This is Protected Function
                             //Protected function call with two conditions first is Inheritance and second is function call with child's class object 
	}

}


//If we want to call a function in different package and in different class without Inheritance there is some steps :-
//1-make a class public
//2-make a function public static
//3-import first package and class into second package and class
//4-call a function with its class name like=House1.function1(); and House2.function4();
