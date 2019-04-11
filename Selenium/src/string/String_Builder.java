package string;

import java.util.Scanner;

public class String_Builder 
{
	static StringBuilder original;

	public static void main(String[] args) 
	
	{
	System.out.println("Please enter a string for pallindrome check");
				Scanner obj=new Scanner(System.in);
				original=new StringBuilder(obj.nextLine());
		
	
	if(original.toString().equalsIgnoreCase(original.reverse().toString()))
	{
		System.out.println("Pallindrome");
		
	}
	else
	{
		System.out.println("not pallindrome");
	}
	
				

	}

}
