package string;

import java.util.Scanner;

public class Pallindrome 
{
	static String original;
	static String reverse = "";

	public static void main(String[] args) 
	{
		System.out.println("Enter a String for check Pallindrome");
		Scanner obj = new Scanner(System.in);
		original = obj.nextLine();
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
			
		}
		System.out.println(reverse);
		
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
	}

}
