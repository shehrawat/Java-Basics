package exception;

public class Null_Pointer_Exception 
{
	static String str;

	public static void main(String[] args) 
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(i);
		}

	}

}
