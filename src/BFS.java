import java.io.*;
import java.util.*;

public class BFS {
	public static void main(String[] args)
	{
		Graph g=new Graph(5);
		g.add(0,1);
		g.add(1,2);
		g.add(2, 3);
		g.add(3, 4);
		g.add(0, 2);
		g.add(0,4);
		g.BFS(1);
		
	}
}
