import java.util.*;
import java.io.*;

public class Unique {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		
		str=sc.nextLine();
		int n=str.length();
		Set<String> set=new HashSet<String>();
		
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			String s=Character.toString(ch);
			if(set.add(s)==false)
			System.out.println("String is not unique");
			
		}
	}

}