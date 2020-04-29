import java.util.*;
import java.io.*;
public class Replace20 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int n=sc.nextInt();
		String[] arr=new String[n];
		arr=str.split("");		
		//String s="%20";
		for(int i=0;i<n;i++)
		{
			if(arr[i].contentEquals(" "))
			{
				arr[i]="%20";
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
