
public class LL {
	
	public class Node{
		Node next;
		int data;
	}
	int count=0;
	Node head;
	
	void  insert(int key)
	{
		Node temp=new Node();
		temp.data=key;
		count++;
		Node n=head;
		if(head==null)
		{
			head = temp;
			temp.next=null;
		} else {
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=temp;
			temp.next=null;	
		}
	}
	void print()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data);
			n=n.next;
		}
	}
	void reverse(int size)
	{
		Node temp=head;
		this.head = reversell(temp,size);
	}
	Node reversell(Node n,int size)
	{
		Node curr=n;
		Node next=null;
		Node prev=null;
		int count=0;
		while(curr!=null && count<size) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next!=null)
        n.next=reversell(next,size);
		
		return prev;
	}
}