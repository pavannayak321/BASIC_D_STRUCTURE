package linkedlist;

public class SLinkedList
{
	private ListNode head;			/*contains the head reference to list node */
	
	
	
	/* printing the link elements */
	public void showData(ListNode head)
	{
		ListNode current = head;
		
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		
	}
	/*inserting the element at the begning  of the LinkedList */
	public void insertAtFirst(int data)
	{
		ListNode new_node = new ListNode(data);
		new_node.next = head;
		head=new_node;
		
		
	}
	/* inserting the element at the end in linked list */
	public void insertAtEnd(int data)
	{
		ListNode new_node =new  ListNode(data);
		ListNode current;
		current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_node;
	}
	
	
	
	/*
	 * inserting a node after the specified node in LinkedList
	 */
	public void insertAfter(ListNode previous,int data)
	{
		if(previous==null)
		{
			System.out.println("the node sholud'nt be empty!!!");
		}
		
		ListNode new_node = new ListNode(data);
		new_node.next = previous.next;
		previous.next = new_node;
		
	}
	
	
	private static class  ListNode
	{
		private int data;
		private ListNode next;
		
		
		ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
		
		
	}

	public static void main(String[] args) {
		SLinkedList slist= new SLinkedList();
		ListNode node1= new ListNode(12);
		ListNode node2  =  new ListNode(32);
		ListNode node3  =  new ListNode(22);
		
		/* assigning the reference to the newly created node */
		slist.head = node1;
		node1.next = node2;
		node2.next = node3;
		slist.insertAtFirst(123);
		
		slist.insertAtEnd(78);
		slist.insertAfter(node2,456);
		slist.showData(slist.head);
		

	}

}
