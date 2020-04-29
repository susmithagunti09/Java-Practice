import java.io.*;
import java.util.*;

public class RotateStr {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String actual=sc.next();
		String rotate=sc.next();
		String check=rotate+rotate;
		if(check.contains(actual))
			System.out.println("is a rotation");
		else
			System.out.println("not a rotation");
	}

}