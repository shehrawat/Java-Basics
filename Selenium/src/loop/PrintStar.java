package loop;

public class PrintStar
{
	public static void main(String str[])
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

 class PrintStar2 
{

	public static void main(String[] args) 
	{
	int i,j,k;
	for(i=1; i<=5; i++)
	{
	for(j=4; j>=i; j--)
	{
	System.out.print(" ");
	}
	for(k=1; k<=(2*i-1); k++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
	}
	}

 class PrintStar3
 {
	 public static void main(String[] args) 
	 {
	  int i, j, k;
	 for(i=5;i>=1;i--)
	 {
	 for(j=4;j>=i;j--)
	 {
	 System.out.print(" ");
	 }
	 for(k=1;k<=(i*2-1);k++)
	 {
	 System.out.print("*");
	 }
	 System.out.println();
	 }
	 }
 }
 
 class PrintStar4
 {
	 public static void main(String[] args) 
	 {
	  int i, j;
	  for(i=5;i>=1;i--)
	 {
	 for(j=1;j<=i;j++)
	 {
	 System.out.print("*");
	 }
	 System.out.println();
	 }
	 }
 }