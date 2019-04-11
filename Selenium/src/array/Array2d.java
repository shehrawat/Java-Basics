package array;

import java.util.Scanner;

public class Array2d 
{

	public static void main(String[] args) 
	{
		int ar[][]={{1,2,3},{2,4,5},{4,4,5}};
		//ar[0][1]=10;
	//	ar[0][2]=20;
		//ar[0][3]=30;
//		ar[0][4]=40;
	//	ar[1][1]=50;
		//ar[1][2]=60;
//		ar[1][3]=70;
	//	ar[1][4]=80;
		//ar[2][1]=90;
//	ar[2][2]=100;
	//	ar[2][3]=110;
		//ar[2][4]=120;
//		ar[3][1]=130;
	//	ar[3][2]=140;
		//ar[3][3]=150;
//		ar[3][4]=160;
	//	ar[4][1]=170;
		//ar[4][2]=180;
//		ar[4][3]=190;
	//	ar[4][4]=200;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
			//	System.out.println("Enter Value");
				//Scanner obj = new Scanner(System.in);
				//ar[i][j] = obj.nextInt();
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
