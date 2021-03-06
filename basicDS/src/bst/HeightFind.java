class Node
{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data  = data;
	}
}

class HeightFind{
	Node root;
	
	public HeightFind(int data)
	{
		root = new Node(data);
	}
	
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
	
	//finding the height of the binary tree
	public int heightFind(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int lh = heightFind(root.left);
		int rh = heightFind(root.right);
		
		return (1+max(lh,rh));
	}
	//Utility Function To Find max of two numbers
	public int max(int a , int b)
	{
		return ((a>b)? a:b);
	}
	
	
	
	public static void main(String[] args)
	{
		HeightFind f  =  new HeightFind(10);
		f.insert(f.root , 28);
		f.insert(f.root , 16);
		f.insert(f.root , 29);
		//f.insert(f.root , 5);
		//f.insert(f.root  ,86);
		
		int h = f.heightFind(f.root);
		System.out.println(h);
	}
}