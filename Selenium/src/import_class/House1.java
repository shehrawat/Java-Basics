package import_class;

public class House1 
{
	public static void function1() //Static Function
	{
		System.out.println("This is a Function1");
	}
	
	void function2() //Non Static Function
	{
		System.out.println("This is a Function2");
	}
	
	void cars()
	{
	    function2();    //we can create class in a class
		
	}

	public static void main(String[] args) 
	{
		House1 obj = new House1();
		obj.function1();
		obj.function2();
		obj.cars();          //Class inside a class
		House1.function1();  //We can call static function with its Class name
		function1();         //We can call static function with its name

	}

}
