class Node{
	int data;
	Node left;
	Node right;
	
	
	public Node(int data)
	{
		this.data = data;
	}
}

class InsertNode{
	
	//pointer to root node
	Node root ;
	
	public InsertNode(int data)
	{
		root = new Node(data);
	}
	
	
	public Node insertNode(Node root,int data)
	{
		//base case if root is null
		if(root==null)
		{
			root  = new Node(data);
			return root;
		}
		
		
		//if key is greater than  given data
		if(root.data < data)
		{
			root.left = insertNode(root.left,data);
		}
		
		if(root.data > data)
		{
			root.right = insertNode(root.right,data);
		}
		return root;
	}
	
	public static void main(String[] args)
	{
		InsertNode n = new InsertNode(15);
	}
}
	
	
	