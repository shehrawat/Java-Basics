package scanner_class;

import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		a = obj.nextInt();
		
		System.out.println("Enter Second Number :");
		b = obj.nextInt();
		
		c=a+b;
		
		System.out.println("Sum is :"+c);
		
		

	}

}
