package exception;

public class Class_Cast_Exception extends Parent
{

	public static void main(String[] args) 
	{
		Class_Cast_Exception obj1 = new Class_Cast_Exception();          //Case1
		Parent obj2 = new Parent();                                      //Case2
		Parent obj3 = new Class_Cast_Exception();                        //Case3
		Class_Cast_Exception obj4 = (Class_Cast_Exception)new Parent();  //Case4

	}

}
