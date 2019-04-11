package exception;

public class Try_Catch_Finally 
{

	public static void main(String[] args) 
	{
		try
		{
        String abc ="xyz";
		
		System.out.println(abc.charAt(0));
		System.out.println(abc.charAt(1));
		System.out.println(abc.charAt(2));
		System.out.println(abc.charAt(3));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("Exception caught in catch block"+ex);
		}
		catch(Exception a)
		{
			System.out.println();
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		System.out.println("Outside try catch finally clause");

	}

}
