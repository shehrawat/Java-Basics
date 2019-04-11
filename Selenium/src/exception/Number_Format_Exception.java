package exception;

public class Number_Format_Exception 
{
	static String str="10";

	public static void main(String[] args) 
	{
		int i = Integer.parseInt(str);
		
		System.out.println(i);

	}

}
