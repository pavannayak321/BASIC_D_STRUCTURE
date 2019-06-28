class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
	this.data = data;
	}
}

class DeleteNode{
	
	Node root;
	
	public DeleteNode(int data)
	{
		root =  new Node(data);
	}
	
	
	
	
	//insert node
	public Node insertNode(Node root,int data)
	{
		//Base Case:if root is null
		if(root==null)
		{
			root =  new Node(data);
			return root;
		}
		
		//trsaverse the tree 
		if(root.data > data){
			root.left = insertNode(root.left , data);
		}
		
		if(root.data < data){
			root.right = insertNode(root.right , data);
		}
		return root;
	}
	
	
	
	
	
	//get inorder traversal of node
	
	public void inOrderTraversal(Node root)
	{
		if(root == null){
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.print(root.data + "    ");
		inOrderTraversal(root.right);
	}
	
	
	//delete the node with one , two and leaf nodes
	public Node deleteNode(Node root ,int data)
	{
		if(root == null)
		{
			return root;
		}
		//recur down the tree 
		if(root.data < data){
			root.right = deleteNode(root.right ,data);
		}
		else if(root.data > data){
			root.left = deleteNode(root.left , data);
		}
		
		
		//if key is matching then
		else
		{
			//Node with only one child or no child 
			if(root.left == null)
			{
				return root.right;
			}
			else if(root.right == null)
			{
				return root.left;
			}
			
			//node with two childs finding inorder successor
			root.data  = minValue(root.right);
			
			//now delete the value of duplicate key of root.key
			root.right = deleteNode(root.right , root.data);
			
			
		}
		return root;
	}
	
	
	
		
		public int minValue(Node root)
		{
			int minValue = root.data;
			while(root.left!=null)
			{
				minValue = root.left.data;
				root = root.left;
			}
			return minValue;
		}
			
			
			
			
			
		
	
	public static void main(String[] args)
	{
		DeleteNode dlt = new DeleteNode(50);
		dlt.insertNode(dlt.root,31);
		dlt.insertNode(dlt.root,61);
		dlt.insertNode(dlt.root,12);
		dlt.insertNode(dlt.root,34);
		dlt.insertNode(dlt.root,57);
		
		dlt.inOrderTraversal(dlt.root);
		
		dlt.deleteNode(dlt.root , 31);
		
		dlt.inOrderTraversal(dlt.root);
	}
}

