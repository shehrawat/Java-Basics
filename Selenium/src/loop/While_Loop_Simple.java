package loop;

public class While_Loop_Simple 
{

	public static void main(String[] args) 
	{
		int i =1;
		while(i<=10)
		{
			loop(i);
			i++;
		}

	}
	
	public static void loop(int k)
	{
		System.out.println(k);
	}

}
