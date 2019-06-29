class Node{
	
	int data;
	Node left;
	Node right;
	
	
	public Node(int data)
	{
		this.data = data;
	}
}

class EqualTrees{
	Node root1 , root2;
	
	
	
	//insert nodes
	public Node insert(Node root , int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		if(root.data  > data)
		{
			root.left  = insert(root.left , data);
		}
		if(root.data <data)
		{
			root.right = insert(root.right  ,data);
		}
	return root;		
	}
	
	
	
	//compare two trees are they equall
	public boolean equaltree(Node a , Node b)
	{
		//Base Case: = 
		if(a == null && b == null)
		{
			return true;
		}
		
		if(a!=null && b!=null)
		{
			return (a.data == b.data) && equaltree(a.left , b.left)&& equaltree(a.right , b.right);
		}
		return false;
	}
		
	
	public static void main(String[] args)
	{
		EqualTrees tree =  new EqualTrees();
		tree.root1 = new Node(51);
		tree.root1.left = new Node(47);
		tree.root1.right = new Node(59);
		
		tree.root1.left.left = new Node(31);
		tree.root1.left.right = new Node(49);
		tree.root1.right.right = new Node(68);
		
		
		
		//
		tree.root2 = new Node(51);
		tree.root2.left = new Node(47);
		tree.root2.right = new Node(59);
		
		tree.root2.left.left = new Node(31);
		tree.root2.left.right = new Node(49);
		tree.root2.right.right = new Node(64);
		
		boolean f = tree.equaltree(tree.root1 , tree.root2);
		System.out.println(f);
	}
		
		
		
	
	


}
