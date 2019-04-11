package condition;

import java.util.Scanner;

public class Even_Odd 
{

	public static void main(String[] args) 
	{
		int i;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		i = obj.nextInt();
		
		if(i%2==0)
		{
			System.out.println("Number is Even");
		}
		
		else
		{
			System.out.println("Number is Odd");
		}

	}

}
