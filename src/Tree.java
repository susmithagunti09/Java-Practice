import java.io.*;
import java.util.*;
	
public class Tree {
	class Node {
		int data;
		Node left;
		Node right;
	}
	Node head;
	static Node prev=null;
	Node root;
	int count=0;
	void insert(int k)
	{
		Node temp=new Node();
		temp.data=k;
		count++;
		if(root==null)
		{
			root=temp;
			temp.left=temp.right=null;
		}
		else
			insertPos(root,temp);
	}
	void insertPos(Node n,Node key)
	{		
			if(key.data<=n.data)
			{
				if(n.left==null)
				{
					n.left=key;
				}
				else {
					insertPos(n.left,key);
				}	
				
			}
			else
			{
				if(n.right==null)
				{
					n.right=key;
				}
				else 
				{
				insertPos(n.right,key);
				}
			}
	}
	void boundary(Node n) {
		if(n==null)
			return;
		
		System.out.print(n.data + " ");
		printbleft(n.left);
			printleaves(n.left);
			printleaves(n.right);
		printbright(n.right);
		
	}
	void printbleft(Node n) {
		if(n==null)
			return;
		
		if(n.left!=null) {
			System.out.print(n.data + " ");
			printbleft(n.left);
		}
		else if(n.right!=null) {
			System.out.print(n.data + " ");
			printbleft(n.right);
		}
	}
	void printleaves(Node n)
	{
		if(n==null)
			return;
		
		printleaves(n.left);
		if(n.left==null && n.right==null)
		{
			System.out.println(n.data+" ");
		}
		
		printleaves(n.right);
	}
	void printbright(Node n)
	{
		if(n==null)
			return;
		if(n.right!=null) {
			printbright(n.right);
		
			System.out.print(n.data + " ");
		}
		else if(n.left!=null) {
			
			printbright(n.left);
			
			System.out.print(n.data + " ");
		}
		
	}
	int maxlevel=0;
	void leftview(Node n,int level)
	{
		if(n==null)
			return;
		if(maxlevel<level)
		{
			
			System.out.println(n.data+" ");
			maxlevel=level;
			
		}
		leftview(n.left,level+1);
		leftview(n.right,level+1);
		
	}
	void rightview(Node n,int level)
	{
		if(n==null)
			return;
		if(maxlevel<level)
		{
			
			System.out.println(n.data+" ");
			maxlevel=level;
			
		}
		rightview(n.right,level+1);
		rightview(n.left,level+1);
		
	}
	
	void bottomview(Node n)
	{
		if(n==null)
			return;
		if(n.left==null && n.right==null)
			System.out.println(n.data);
		bottomview(n.left);
		bottomview(n.right);
			
	}
	void DLLConvert(Node n)
	{
		
		if(n == null)
		{
			return;
		}
			
		DLLConvert(n.left);
		
		if (prev == null)  
            head = n; 
        else
        { 
            root.left = prev; 
            prev.right = n; 
        } 
        prev = n; 
   
		DLLConvert(n.right);
	}
	
	
	//tree traversal
	void inorderPos()
	{
		Node temp=root;
		inorder(temp);
	}
	void inorder(Node temp)
	{
		//Node temp=root;
		if(temp==null)
			return;
		
		inorder(temp.left);
		System.out.println(temp.data+" ");
		inorder(temp.right);
		
	}
	void printList(Node n)
	{
		while(n!=null) {
			System.out.println(n.data);
			n=n.right;
		}
	}
	void preporderPos()
	{
		Node temp=root;
		preorder(temp);
	}
	void preorder(Node temp)
	{
		if(temp==null)
			return;
		
		System.out.println(temp.data+" ");
		preorder(temp.left);
		preorder(temp.right);
	}
	void postporderPos()
	{
		Node temp=root;
		postorder(temp);
	}
	void postorder(Node temp)
	{
		if(temp==null)
			return;
		
		postorder(temp.left);
		postorder(temp.right);
		System.out.println(temp.data+" ");
	}
	
	int i=0;
	int[] arr=new int[3];
	int[] insertion(Node n)
	{
		if(n==null)
			return null;
		
		insertion(n.left);
		arr[i]=n.data;
		i++;
		insertion(n.right);
		return arr;
	}
	void findpair(Map<Integer,Integer> map,int n)
	{
		int sum=n;
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			if(map.containsKey(sum))
			{
				System.out.println("found");
				break;
				
			}
			else
				System.out.println("Not found");
			
		}
	}

}
