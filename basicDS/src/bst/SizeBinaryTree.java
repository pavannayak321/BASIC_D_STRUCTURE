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

class SizeBinaryTree{
	
	Node root;
	
	public SizeBinaryTree(int data)
	{
		root = new Node(data);
	}
	
	
	//insert Elements
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
	
	
	//finding the size of the binary tree
	public int findSize(Node root)
	{
		if(root ==null)
		{
			return 0;
		}
		return 1+findSize(root.left)+findSize(root.right);
	}
	
	
		public static void main(String[] args)
		{
			SizeBinaryTree tree  =  new SizeBinaryTree(51);
			tree.insert(tree.root , 47);
			tree.insert(tree.root , 59);
			tree.insert(tree.root , 36);
			
			int s = tree.findSize(tree.root);
			System.out.println("Size of tree is"+s);  //4
		}
}
			