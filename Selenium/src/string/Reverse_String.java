package string;

import java.util.Scanner;

public class Reverse_String
{
	static String original;
	static String reverse="";
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a String");
		Scanner obj = new Scanner(System.in);
		original = obj.nextLine();
		
		for(int i=original.length()-1;i>=0; i--)
		{
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
