import java.util.*;
import java.io.*;
class Parks {
	
	static int parks=0;
	public void countParks(int[][] matrix, int rows)
	{
		boolean visited[][] = new boolean[rows][rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				if(matrix[i][j]==1 && !visited[i][j])
				{
					DFS(matrix, i, j, visited,rows);
					parks++;
				}
			}
		}
	}
	public void DFS(int[][] matrix, int row, int column, boolean visited[][],int size)
	{
		int[] rownum=new int[] {1,-1,0,0};
		int[] colnum= new int[]{0,0,-1,1};
		visited[row][column]=true;
		for(int k=0;k<4;k++)
		{
			if(isSafe(matrix,row+rownum[k],column+colnum[k],visited,size))
			{
				DFS(matrix,row+rownum[k],column+colnum[k],visited,size);
			}
	
		}
	}
	public boolean isSafe(int[][] matrix, int row, int column, boolean visited[][],int size)
	{
		return (row >= 0) && (row < size) && (column >= 0) 
				&& (column < size) && (matrix[row][column] == 1 && !visited[row][column]);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] matrix=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		Parks p=new Parks();
		p.countParks(matrix,n);
		System.out.println(parks);
		
	}

}
