import java.io.*;
import java.util.*;

public class Example {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		System.out.println(str.substring(n-1));
		String str1=str.substring(n-1);
		String str2=str.substring(0,n-1);
		System.out.println(str2+str1);
	}
}
	