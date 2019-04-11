package set;

import java.util.LinkedHashSet;

public class Linked_Hashset 
{

	public static void main(String[] args) 
	{
		LinkedHashSet <String> set = new LinkedHashSet<>();
		
		set.add("abc");
		set.add("hjk");
		set.add("dcsa");
		set.add("abc");
		set.add("aaa");
		
		for(String str:set)
		{
			System.out.println(str);
		}
		
		/*for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i));
		}*/

	}

}
