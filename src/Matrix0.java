import java.util.*;
import java.io.*;

public class Matrix0 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==0)
				addzero(arr,i,j,m,n);	
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	public static void addzero(int[][] arr,int i,int j, int m, int n)
	{
		for(int k=0;k<m;k++)
		{
			if(arr[k][j]!=0)
			arr[k][j]=-1;
		}
		for(int l=0;l<n;l++)
		{
			if(arr[i][l]!=0)
				arr[i][l]=-1;
		}
	}
	

}
