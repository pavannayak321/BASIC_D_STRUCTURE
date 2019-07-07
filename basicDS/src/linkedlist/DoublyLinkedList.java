package linkedlist;

public class DoublyLinkedList {
	ListNode head;
	ListNode tail;
	int length;
	

	private class ListNode
	{
		int data;
		ListNode next;
		ListNode prev;
		
	public 	ListNode(int data)
		{
			this.data = data;
			this.next = null;
			this.prev = null;
			
		}
	}
	
	
	/* creating the doubly LinkedList constructor */
	public DoublyLinkedList()
	{
		this.head = null;
		this.tail = null;
		this.length  = 0;
	}
	
	
	
	/*
	 * inserting a node at the begning of the LinkedList 
	 */
	public void insertAtBegining(int data)
	{
		ListNode new_node = new ListNode(data);
		/*
		 * checking condition for first element of the linked list  if it contains the null value simply attach tail pointer to it
		 */
		if(isEmpty())
		{
			tail =  new_node;
		}
		else
		{
			head.prev = new_node;
		}
		
		new_node.next = head;
		head = new_node;
		
		length++;
	}
	
	
	/*
	 * inserting the element at the end of the LinkedList
	 */
	public void insertAtEnd(int data)
	{
		ListNode new_node = new ListNode(data);
		if(isEmpty())
		{
			new_node = head;
		}
		else
		{
			tail.next = new_node;
			new_node.prev = tail;
		}
		tail = new_node;
	}
	
	
	/*
	 * printing the element of the doubly linked list elements 
	 */
	public void printElement()
	{
		ListNode tmp = head;
		while(tmp!= null)
		{
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	public boolean isEmpty()
	{
		return length==0;
	}
	
	
	public static void main(String[] args)
	{
		DoublyLinkedList dllist = new DoublyLinkedList();
		dllist.insertAtBegining(12);
		dllist.insertAtEnd(234);
		dllist.insertAtBegining(21);
		dllist.printElement();
		
	}
	

	}
