sclass Node{
	int data;
	Node left;
	Node right;
	
	
	public Node(int data)
	{
		this.data = data;
	}
}


class InOrder{
	
	Node root;
	
	
	public InOrder(int data)
	{
		root = new Node(data);
	}
	
	
	
	//insert node
	public Node insertNode(Node root,int data)
	{
		//base case if root is null
		if(root==null)
		{
			root  = new Node(data);
			return root;
		}
		
		
		//if key is greater than  given data
		if(root.data > data)
		{
			root.left = insertNode(root.left,data);
		}
		
		if(root.data < data)
		{
			root.right = insertNode(root.right,data);
		}
		return root;
	}
	
	
	
	
	
	//inorder traversal
	public void inOrderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.print(root.data+"     ");
		inOrderTraversal(root.right);
	}
	
	public static void main(String[] args)
	{
		
		InOrder inordr = new InOrder(15);
				inordr.insertNode(inordr.root,7);
				inordr.insertNode(inordr.root,22);
				inordr.insertNode(inordr.root,5);
				inordr.insertNode(inordr.root,9);
				inordr.insertNode(inordr.root,21);
				inordr.insertNode(inordr.root,23);
				
				inordr.inOrderTraversal(inordr.root);
	}	
}