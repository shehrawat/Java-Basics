package condition;

import java.util.Scanner;

public class If_Else 
{

	public static void main(String[] args) 
	{
		int age;
		String voter_card;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter age :");
		age = obj.nextInt();
		
		System.out.println("Enter Voter Card Status :");
		voter_card = obj.next();
		
		//if(age>=18&&voter_card.equalsIgnoreCase("yes"))
		if(age>=18&&voter_card.equals(voter_card))
		
			System.out.println("Eligible for vote");

		
		else
		
			System.out.println("Not Eligible for vote");
		
	}

}
