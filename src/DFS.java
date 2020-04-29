import java.io.*;
import java.util.*;

public class DFS {
	public static void main(String[] args)
	{
		GraphDFS g=new GraphDFS(5);
		g.add(0,1);
		g.add(1,2);
		g.add(2, 3);
		g.add(3, 4);
		g.add(0, 2);
		g.add(0,4);
		g.DFS(0);
		
	}
}
