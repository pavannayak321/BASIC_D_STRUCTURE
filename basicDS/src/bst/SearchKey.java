class Node
{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data = data;
	}
}

class SearchKey{
	Node root;
	
	public SearchKey(int data)
	{
		root = new Node(data);
	}
	
	
	//insert Elements in BST
	public Node insert(Node root , int data)
	{
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
		
		if(root.data  > data)
			root.left = insert(root.left,data);
		if(root.data < data)
			root.right = insert(root.right  ,data);
		return root;
	}
	
	
	
	
	//serach key method
	public Node search(Node root , int data)
	{
		if(root==null)
		{
			
			return root;
		}
		if(root.data ==data)
		{
			System.out.println("Key Found Succesfully");
			return root;
		}
		search(root.left,data);
		search(root.right,data);
		
			System.out.println("Key Not Found Succcefully");
		return root;
	}
		public static void main(String[] args)
		{
			SearchKey tree =  new SearchKey(51);
			tree.insert(tree.root , 36);
			tree.insert(tree.root , 67);
			tree.insert(tree.root , 12);
			tree.insert(tree.root , 66);
			tree.insert(tree.root , 65);
			tree.search(tree.root , 3);
		}
}
			