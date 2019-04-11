package string;

import java.util.Scanner;

public class Reverse_Integer 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		Scanner obj = new Scanner(System.in);
		int Dividend = obj.nextInt();
		
		int Quotient = 0;
		int Remainder = 0;
		int Divisor = 10;
		
		do
		{
			Quotient = Dividend/10;
			Remainder = Dividend%10;
			Dividend = Quotient;
			System.out.print(Remainder);
		}
		while(Quotient>=1);
	
	}

}
