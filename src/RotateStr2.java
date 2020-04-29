import java.io.*;
import java.util.*;

public class RotateStr2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String actual=sc.next();
		
		int n1=actual.length();
		String rotate=sc.next();
		
		int n2=rotate.length();
		
		
		if(n1==n2 && !actual.equals(rotate))
		{
			for(int i=0;i<n1-1;i++)
			{
				String str1="",str2="",check="";
				str1=str1+rotate.substring(0,n1-i-1);
				str2=str2+rotate.substring(n1-i-1);
				check=str2+str1;
				
				if(check.contentEquals(actual))
				{	
					System.out.println("Is a rotation");
					break;
				}
				
			}
			System.out.println("Not a rotation");
			
		}
		else
		System.out.println("Not a rotation");
		
	}

}