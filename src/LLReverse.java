import java.util.*;
import java.io.*;
public class LLReverse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LL ll=new LL();
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		ll.insert(1);
		ll.print();
		ll.reverse(3);
		ll.print();
	}

}
