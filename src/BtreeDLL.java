import java.util.*;

public class BtreeDLL {
	public static void main(String[] args)
	{
		Tree t=new Tree();
		t.insert(20);
		t.insert(12);
		t.insert(30);
		t.insert(40);
		t.insert(35);
		t.insert(10);
		t.insert(5);
		t.insert(50);
		t.insert(14);
		t.insert(13);
		t.insert(32);
		t.insert(37);
		t.insert(15);
		//t.boundary(t.root);
		//t.leftview(t.root,1);
		//t.rightview(t.root, 1);
		t.bottomview(t.root);
		
	}

}
