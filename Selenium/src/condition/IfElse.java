package condition;

import java.util.Scanner;

public class IfElse 
{

	public static void main(String[] args) 
	{
		int i;
		
		System.out.println("Enter Number");
		Scanner obj = new Scanner(System.in);
		i = obj.nextInt();
		
		if(i%2==0)
			
			System.out.println("Number is Even");
		
		else
			
			System.out.println("Number is Odd");

	}

}
