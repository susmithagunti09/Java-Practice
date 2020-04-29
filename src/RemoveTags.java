import java.io.*;
import java.util.*;
import java.util.regex.*;
public class RemoveTags {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//int n=s.length();
		s=s.replaceAll("\\<.*?\\>", "");
		System.out.println(s);
	}

}
