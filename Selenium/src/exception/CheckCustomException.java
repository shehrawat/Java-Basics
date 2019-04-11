package exception;

import java.util.Scanner;

public class CheckCustomException 
{
	static int age;

	public static void main(String str[])
	{	
		System.out.println("Enter age :");
		Scanner obj = new Scanner(System.in);
		age = obj.nextInt();
		
		if(age>=18)
			
			System.out.println("Eligible");
		
		else if(age<18 && age>=0)
			
			System.out.println("Not Eligible");
		
		else
		{
			throw new CustomException();
		}
	}
}
