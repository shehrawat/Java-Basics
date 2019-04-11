package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hashmap 
{

	public static void main(String[] args) 
	{
        Map <Integer,Object> map = new LinkedHashMap <> ();
		
		map.put(10, 10);
		map.put(21, "ghi");
		map.put(232, 'A');
		map.put(21, 10);
		map.put(65, 40.6);
		map.put(643, 'B');
		
		for(int i=0;i<map.size();i++)
		{
			System.out.println(map.get(i));
		}

	}

}
