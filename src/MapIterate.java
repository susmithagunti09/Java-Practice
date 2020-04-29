import java.io.*;
import java.util.*;

public class MapIterate {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1,1);
		map.put(10,1);
		map.put(7,1);
		map.put(3,1);
		map.put(5,1);
		int flag=0;
		int n=sc.nextInt();
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		for(int num:map.keySet())
		{
			int value=map.get(num);
			System.out.println("key "+num + " value "+value);
		}
		
		for(int num:map.keySet())
		{
			//int value=map.get(num);
			//value--;
			int diff=n-num;
			
			if(map.containsKey(diff))
			{
				if(diff==num)
				{
					if(map.get(diff)>1)
						flag=1;
				}
				else
				flag=1;
			}
			
		}
		if(flag==1)
		{
			System.out.println("found");
			
		}
		else
			System.out.println("Not found");
		
	}

}
