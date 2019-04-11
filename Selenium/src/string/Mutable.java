package string;

import java.util.Scanner;

public class Mutable 

{
	static StringBuilder  original;	
	public static void main(String[] args) 
	
	{
		System.out.println("Please enter a String Builder");
		Scanner obj=new Scanner(System.in);
		original=new StringBuilder(obj.nextLine());
		original.append(" Shehrawat");
		System.out.println(original);
	}

}
