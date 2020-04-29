import java.util.*;
import java.io.*;
public class TreeInsert {
	public static void main(String[] args)
	{
		Tree tree=new Tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(5);
		tree.insert(3);
		tree.insert(6);
		tree.insert(18);
		tree.insert(25);
		tree.insert(4);
		tree.insert(1);
		tree.insert(15);
		//tree.inorderPos();
		tree.DLLConvert(tree.root);
		tree.printList(tree.head);
	}

}
