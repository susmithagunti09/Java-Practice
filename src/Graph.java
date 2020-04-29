//import java.io.*;
import java.util.*;
public class Graph {
	int v;
	LinkedList<Integer>[] arr;
	Graph(int v)
	{
		this.v=v;
		arr=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			arr[i]=new LinkedList<Integer>();
		}
	}
	
	void add(int v,int e)
	{
		arr[v].add(e);
		arr[e].add(v);
	}
	
	void BFS(int start)
	{
		boolean[] visited=new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[start]=true; 
        queue.add(start); 
        while(queue.size()!=0)
        {
        	start = queue.poll(); 
            System.out.print(start+" ");
            Iterator<Integer> i = arr[start].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            }
        }
        
	}

}
