package loops;

import java.util.Scanner;

public class Palindrome2 
{
	
		public static void main(String[] args) 
		{
			System.out.println("Enter Number");
			Scanner obj = new Scanner(System.in);
			int n = obj.nextInt();
			
			int rem,rev=0,org;

			
			org=n;
			
			while(n>0)
			{
				rem=n%10;
				rev=(rev*10)+rem;
				n=n/10;
			}
			
			if(org==rev)
			{
				System.out.println("Number is Palindrome");
			}
			else
			{
				System.out.println("Number is Not Palindrome");
			}

		}

	}