import java.util.*;
import java.io.*;

public class Subarray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		int start=0;
		int end=0;
		int maxsize=-1;
		for(int i=0;i<n;i++) {

			if(arr[i]==0)
				sum=-1;
			else
				sum=1;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==0)
					sum+=-1;
				else
					sum+=1;
				if(sum==0 && maxsize<j-i+1)
				{
					maxsize=j-i+1;
					start=i;
					end=j;
				}
			}
		}
		if(maxsize==-1)
			System.out.println("no array");
		else
			System.out.println(start+" "+end);
	}

}
