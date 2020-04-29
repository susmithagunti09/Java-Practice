//import java.io.*;
import java.util.*;
public class GraphDFS {
	int v;
	LinkedList<Integer>[] arr;
	GraphDFS(int v)
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
	
	void DFS(int start)
	{
		boolean[] visited=new boolean[v];
		Stack<Integer> stack = new Stack<Integer>();
		visited[start]=true; 
        stack.push(start); 
        while(stack.size()!=0)
        {
        	start = stack.pop(); 
            System.out.print(start+" ");
            Iterator<Integer> i = arr[start].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    stack.push(n); 
                } 
            }
        }
        
	}

}
