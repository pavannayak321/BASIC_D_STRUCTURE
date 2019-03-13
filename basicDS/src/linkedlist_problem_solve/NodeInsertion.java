package linkedlist_problem_solve;

 class NodeInsertion {
	
	static Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data  = data;
		}
		
	}
	
	//insert the elements at first
	public void insertAtFirst(int data)
	{
		System.out.println("iam inserting at front :");
		Node new_front = new Node(data);
		new_front.right = root;
		root = new_front;
	}
	
	//printing the current root data
	public void printRoot()
	{
		System.out.println("Root is:"+root.data);
	}

	//inserting at the end
	public void insertAtEnd(int data)
	{
		
		if(root ==null) {
			Node atEnd = new Node(data);
			root = atEnd;
		}
		else
		{
			Node tmp  = root;
			//traversing the last node that has null at the end 
			while(tmp!=null)
			{
				tmp = tmp.right;
			}
			
			Node atEnd = new Node(data);
			atEnd.right = atEnd;
		}
	}
	
	
	public static void main(String[] args) {
		
		NodeInsertion list = new NodeInsertion();
		
		
		list.insertAtFirst(123);
		list.printRoot();
		
		list.insertAtFirst(321);
		list.printRoot();
		
		list.insertAtEnd(444);
		list.printRoot();
	}

}
