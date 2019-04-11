package list;

import java.util.LinkedList;
import java.util.List;

public class Linked_List
{

	public static void main(String[] args) 
	{
        List <String> list_str = new LinkedList();
		
		list_str.add("abc");
		list_str.add("def");
		list_str.add("aad");
		list_str.add("jkl");
		list_str.add("abc");

		
		for(int i=0;i<list_str.size();i++)
		{
			System.out.println(list_str.get(i));
		}


	}

}
