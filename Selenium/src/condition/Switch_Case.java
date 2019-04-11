package condition;

import java.util.Scanner;

public class Switch_Case 
{

	public static void main(String[] args) 
	{
		String car_type;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Car Type :");
		car_type = obj.nextLine();
		
		switch(car_type)
		{
		case "Hyundai" : 
			System.out.println("This is Hyundai Car"); 
			break;
		
		case "Maruti" :
			System.out.println("This is Maruti Car"); 
			break;
		
		case "Honda" :
			System.out.println("This is Honda Car");
			break;
		
		default :
			System.out.println("This is Default Car"); 
			break;
		
		}

	}

}
