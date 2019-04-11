package set;

import java.util.HashSet;

public class Hash_Set 
{

	public static void main(String[] args) 
	{
		HashSet <String> set = new HashSet <String>();
		
		set.add("abc");
		set.add("dgi");
		set.add("aad");
		set.add("abc");
		set.add("aab");
		
		for(String str:set)
		{
			System.out.println(str);
		}
		
		/*for(int i=0;i<set.size();i++)
		{
			System.out.println(set);
		}*/
	
	}

}
