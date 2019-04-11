package map;

import java.util.HashMap;
import java.util.Map;

public class Character_Count 
{

	public static void main(String[] args) 
	{
		int count=1;
		Map <Character,Integer> map = new HashMap <> ();
		String name = "Ajay Shehrawat";
		
		for(int i=0;i<name.length();i++)
		{
			if(map.containsKey(name.charAt(i)))
			{
				map.put(name.charAt(i), map.get(name.charAt(i))+1);
			}
			else
			{
				map.put(name.charAt(i), count);
			}
		}

	}

}
