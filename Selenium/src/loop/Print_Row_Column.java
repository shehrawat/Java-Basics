package loop;

public class Print_Row_Column 
{
	public static void main(String Str[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

