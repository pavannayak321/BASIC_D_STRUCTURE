class DoublyLinkedListDemo
{
	ListNode head;
	ListNode tail;
	int length;
	
	public DoublyLinkedListDemo(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	
	private static class ListNode
	{
		int data;
		ListNode prev;
		ListNode next;
		
		public ListNode(int data){
			this.data = data;
		}
	}
	
	
	
	//insert node at the Begining of the linked list
	public void insertBeg(int data){
		ListNode new_node = new ListNode(data);
		
		if(isEmpty()){
			//head = new_node;
			tail = new_node;
			length ++;
		}
		else{
			head.prev = new_node;
			length++;
		}
		new_node.next = head;
		head = new_node;
	}
	
	
	//insert node at the end of the linked list 
	public void insertEnd(int data){
		ListNode new_node  = new ListNode(data);
		//Base case if lis is empty 
		if(isEmpty()){
			insertBeg(data);
			tail = new_node;
		}
		else{
			tail.next = new_node;
			new_node.prev = tail;
			tail = new_node;
		}
	}
	
	
	//boolean function to return weather list contains node 0  or more
	public boolean isEmpty(){
		return length==0;
	}
	
	
	
	//print Elements of LinkedList
	public void printEle(){
		ListNode tmp = head;
		while(tmp!=null){
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		DoublyLinkedListDemo list = new DoublyLinkedListDemo();
		//list.insertBeg(23);
		System.out.println(list.length);
		list.insertEnd(34);
		//System.out.println(list.length);
		//list.printEle();
		list.insertBeg(12);
		list.insertBeg(23);
		list.insertBeg(45);
		list.insertBeg(67);
		list.insertBeg(78);
		list.insertBeg(89);
		
		
		list.printEle();
	}
}