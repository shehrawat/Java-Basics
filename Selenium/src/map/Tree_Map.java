package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map 
{

	public static void main(String[] args) 
	{
        Map <Integer,Object> map = new TreeMap <> ();
		
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
