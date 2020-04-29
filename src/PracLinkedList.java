import java.util.*;
public class PracLinkedList {

	class Node {
		int data;
		Node next;
	}
	
	Node head;
	int count=0;
	
	void insertBegin(int i) 
	{
		Node n = new Node();
		count++;
		n.data = i;
		if (head != null) 
		{
			n.next = head;	
		}
		head = n;
	}
	
	void insertEnd(int j) 
	{
		Node n=new Node();
		count++;
		n.data=j;
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=n;
		n.next=null;
	}
	void delete(int key)
	{
		Node temp=head;
		Node prev=null;
		if(temp!=null && temp.data == key)
		{
			head=temp.next;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("Key not found");
		}
		prev.next=temp.next;
		count--;
	}
	void delete_dups()
	{
		Node temp=head;
		Node prev=null;
		Map<Integer, Boolean> map=new HashMap<>();
		while(temp!=null)
		{
		
			if(map.containsKey(temp.data)) 
			{
				prev.next=temp.next;
				temp=prev.next;
				count--;
			}
			else
			{
				map.put(temp.data,true);
				prev=temp;
				temp=temp.next;
			}
				
		}
	}
	void reverse()
	{
		Node curr=head;
		Node next=null;
		Node prev=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	int middleEle()
	{
		Node temp1=head;
		Node temp2=head;
		if(head!=null) 
		{
		while(temp2!=null&&temp2.next!=null)
			{
				temp1=temp1.next;
				temp2=temp2.next.next;
			}
			return temp1.data;
		}
		
		if(head==null)
		System.out.println("LinkedList is empty");
		return 0;
	}
	int len_of_list()
	{
		int len=0;
		Node temp=head;
		while(temp!=null)
		{
			len+=1;
			temp=temp.next;
		}
		return len;
	}
	PracLinkedList add(PracLinkedList l)
	{
		PracLinkedList ans=new PracLinkedList();
		int n2=l.len_of_list();
		int n1=this.len_of_list();
		int carry=0;
		l.reverse();
		this.reverse();
		Node temp1=l.head;
		Node temp2=this.head;
		while(temp1!=null || temp2!=null)
		{
			int sum1=0,sum2=0;
			if(temp1!=null) 
			{
				sum1=temp1.data;
				temp1=temp1.next;
			}
			if(temp2!=null)
			{
				sum2=temp2.data;
				temp2=temp2.next;
			}
			int sum=(carry+sum1+sum2)%10;
			ans.insertBegin(sum);
			carry=(sum1+sum2+carry)/10;
			
		}
		if(carry!=0)
		ans.insertBegin(carry);
		return ans;
	}
}
