import java.util.*;
import java.io.*;
public class Middle {
	public static void main(String[] args)
	{
		PracLinkedList middlell=new PracLinkedList();
		middlell.insertBegin(3);
		middlell.insertBegin(2);
		middlell.insertBegin(4);
		middlell.insertBegin(1);
		middlell.insertBegin(2);
		middlell.delete_dups();
		middlell.traverse();
	}

}
