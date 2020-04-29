import java.util.*;
import java.io.*;

public class Compress {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		int n=str1.length();
		String[] arr=new String[n];
		if(n==0)
		{
			System.out.println("Enter valid string");
		}
		arr=str1.split("");
		String ans=arr[0];
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i].contentEquals(arr[i-1]))
			{
				count++;
			}
			else
			{
				if(count>1) {
				String num=Integer.toString(count);
				ans=ans+num;
				}
				count=1;
				ans=ans+arr[i];
			}
		}
		System.out.println(ans);
	}
}