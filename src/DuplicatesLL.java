import java.util.*;
import java.io.*;

public class DuplicatesLL {
	
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		PracLinkedList ll = new PracLinkedList();
		ll.insertBegin(1);
		ll.insertBegin(2);
		ll.insertBegin(3);
		ll.insertBegin(4);
		ll.insertBegin(2);
		ll.delete_dups();
		ll.traverse();
	}

}
