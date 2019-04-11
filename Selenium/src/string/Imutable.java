package string;

import java.util.Scanner;

public class Imutable 
{
	static String original;
	static String reverse;
	
	public static void main(String[] args) 
	
	{
		System.out.println("Please enter a String");
		Scanner obj=new Scanner(System.in);
		original=obj.nextLine();
		reverse=original.concat(" Shehrawat");
		System.out.println(reverse);
	}

}
