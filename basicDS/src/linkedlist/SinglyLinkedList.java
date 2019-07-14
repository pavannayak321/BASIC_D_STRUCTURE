public class SinglyLinkedList
{
	//contains the reference to the head of the linked list
	private ListNode head;
	
	private static class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public  void insertBeg(int data)
	{
		ListNode new_node  =  new ListNode(data);
		if(head==null){
			head = new_node;
			
		}
		//else ListNode contains the elements 
		else
		{
			new_node.next  = head;
			head =new_node;
		}
	}
	
	//print elements of linkedlist 
	public void printElements(){
		ListNode tmp = head;
		while(tmp!=null){
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	//finding the length of linkedlist
	public int length(){
		int count = 0;
		ListNode tmp  = head;
		while(tmp!=null){
		count++;
		tmp=tmp.next;
		}
		return count;
	}
	
	//inserting the elements at the given position
	public void insertPos(int position,int data)
	{
		ListNode new_node = new ListNode(data);
		int count = 1;
		ListNode prev = head;
		while(count<=position-2){
			prev =  prev.next;
			count = count+1;
		}
		new_node.next = prev.next;
		prev.next = new_node;
	}
	
	//insert at the end of linkedlist
	public void insertEnd(int data)
	{
		ListNode new_node  = new ListNode(data);
		if(head==null){
			head = new_node;
			return;
		}
		ListNode tmp = head;
		while(tmp.next!=null){
			tmp = tmp.next;
		}
		tmp.next  = new_node;
	}
	
	
	
	//search key in linkedlist
	public boolean searchKey(int Searchkey){
		ListNode tmp  = head;
		int c= 1;
		while(tmp.next!=null){
			if(tmp.data == Searchkey){
				System.out.println("key found at index"+c);
				return true;
			}
			tmp = tmp.next;
			c++;
		}
		return false;
	}
	
	
	//reverse the singly linked list 
	
	public void  reverse(){
		ListNode current ;
		ListNode prev=null;
		ListNode next=null;
		
		current = head;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		while(prev!=null){
			System.out.print(prev.data+" ");
			prev = prev.next;
		}
	}
	
	
	//ifnd the middle element of linked list 
	public ListNode findMiddle(ListNode head){
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		if(head!=null){
		
			while(fastPtr!=null && fastPtr.next!=null)
			{
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
				
			}
		}
		//System.out.println(slowPtr.data+"  ");
		return slowPtr;
	}
	
	/*public ListNode sortedList(ListNode a , ListNode b)
	{
		ListNode result;
		
	
	public ListNode mergesort(ListNode head)
	{
		ListNode middleOfNext;
		if(head==null)||(head.next==null){
			return head;
		}
		ListNode middle = findMiddle(head);
			middleOfNext =  middle.next;
			middle.next = null;
			
			ListNode left_node = mergesort(head);
			ListNode right_node =  mergesort(middleOfNext);
			
		ListNode sortedlist = sortedList(left_node , right_node);	
		
	*/
	public static void main(String[] args)
	{
		//-------------
		SinglyLinkedList list =  new SinglyLinkedList();
		//list.insertBeg(234);
		list.insertEnd(12);
		list.insertBeg(22);
		list.insertBeg(34);
		//list.printElements();
		//int j = list.length();
		//System.out.println("length of linked list"+j);
		list.insertPos(2,53);
		list.insertEnd(234);
		//list.insertEnd(345);
		list.printElements();
		System.out.println("Finding the middle lelememnt");
		//list.findMiddle();
		//list.printElements();
		//list.searchKey(53);
		list.reverse();
		//list.findMiddle();
		//System.out.println(j.data);
		//list.printElements();
	}
}
	
	
	
	