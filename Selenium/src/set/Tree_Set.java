package set;

import java.util.TreeSet;

public class Tree_Set 
{

	public static void main(String[] args) 
	{
	TreeSet <String> set = new TreeSet <String>();
		
		set.add("abc");
		set.add("dgi");
		set.add("aad");
		set.add("abc");
		set.add("aab");
		
		for(String str:set)
		{
			System.out.println(str);
		}

	}

}
