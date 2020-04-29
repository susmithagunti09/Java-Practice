import java.util.*;


import java.io.*;

public class FindpairTree {
	
	public static void main(String[] args)
	{
		Tree t=new Tree();
		t.insert(20);
		t.insert(30);
		t.insert(10);
		
		int[] arr=new int[3];
		arr=t.insertion(t.root);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		Map<Integer,Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],1);
		}
		t.findpair(map,30);
		
	}
	
}
