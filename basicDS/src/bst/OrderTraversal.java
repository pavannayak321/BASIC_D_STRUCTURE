class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data  = data;
	}
}

class OrderTraversal{
	Node root;
	
	public OrderTraversal(int data)
	{
		root = new Node(data);
	}
	
	//pre order traversal  <root><left><right>
	public void preOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+ "    ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	//inOrder traversal in tree <left><root><right>
	public void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+"    ");
		inOrder(root.right);
	}
	
	
	//post order traversal		<left><right><root>
	public void postOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ "    ");
	}
	
	
	//insert node in tree
	public Node insert(Node root , int data)
	{
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
		
		if(root.data  > data)
		{
			root.left = insert(root.left,data);
		}
		if(root.data < data)
		{
			root.right = insert(root.right  ,data);
		}
		return root;
	}
	
	
	
	
	public static void main(String[] args)
	{
		OrderTraversal tree  = new OrderTraversal(51);
		//tree.insert(tree.root , 51);
		tree.insert(tree.root  ,47);
		tree.insert(tree.root  ,59);
		tree.insert(tree.root  ,31);
		tree.insert(tree.root  ,49);
		tree.insert(tree.root  ,68);
		
		System.out.println("InOrder Traversal");
		tree.inOrder(tree.root);
		
		System.out.println('\n'+"PreOrder Traversal");
		tree.preOrder(tree.root);
		
		System.out.println('\n'+"Post Order Traversal");
		tree.postOrder(tree.root);
	}

}