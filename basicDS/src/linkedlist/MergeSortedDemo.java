public class MergeSortedDemo
{
	private  ListNode head1;
	private  ListNode head2;
	
	private static class ListNode
	{
		int data;
		ListNode next;
		public ListNode(int data)
		{
			this.data = data;
			this.next = next;
		}
	}

	//inert node at  Beg

	public void insertBeg(int data , ListNode head)
	{
		ListNode current = head;
		ListNode new_node  =  new ListNode(data);
		if(current==null)
		{
			current = new_node;
			return;
		}
		else
		{
			new_node.next  =  head;
			head =  new_node;
		}
	}
	
	//insert Node at End
	public void insertEnd(int data , ListNode head)
	{
		ListNode current  =  head;
		ListNode new_node  =  new ListNode(data);
		if(head==null){
			head = new_node;
			return;
		}
		while(current.next!=null){
			current = current.next;
		}
		current.next = new_node;
	}
	
	public void reverse(ListNode head)
	{
		ListNode current  = head;
		ListNode prev = null;
		ListNode next = null;
		
		if(head == null)
		{
			return;
		}
		else
		{
			next  = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		while(prev!=null)
		{
			System.out.println(prev.data);
			prev = prev.next;
		}
	}

	//print elements
	public void printEle(ListNode head)
	{
		ListNode current   = head;
		
		while(current!=null){
			System.out.print(current.data);
		}
	}

	public static void main(String[] args)
	{
		
		MergeSortedDemo sortedMerge = new MergeSortedDemo();
		sortedMerge.insertBeg(12 , sortedMerge.head1);
		sortedMerge.insertBeg(33,sortedMerge.head1);
		sortedMerge.printEle(sortedMerge.head1);
	}
}
