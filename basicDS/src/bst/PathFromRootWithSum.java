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

class PathFromRootWithSum
{
	Node root;
	public PathFromRootWithSum(int data)
	{
		root = new Node(data);
	}
	
	
	public Node insert(Node root , int data)
	{
		//Base case
		
		if(root==null){
			root = new Node(data);
		}
		if(root.data > data){
			root.left = insert(root.left , data);
		}
		if(root.data < data){
			root.right = insert(root.right , data);
		}
		return root;
	}
	
	//inorder traversal
	public void inorder(Node root){
		if(root == null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	
	public boolean leafSum(Node root ,int sum)
	{/*
		if(root == null){
			return	(sum==0);
		}
		
		int subSum = sum - root.data;
		
		if(subSum==0 && root.left==null && root.right==null)
		{
			return true;
		}
		
		leafSum(root.left , subSum);
		leafSum(root.right , subSum);
		
		return false;
		*/
		if (root == null) 
            return (sum == 0); 
        else 
        { 
            boolean ans = false; 
   
            /* otherwise check both subtrees */
            int subsum = sum - root.data; 
            if (subsum == 0 && root.left == null && root.right == null) 
                return true; 
            if (root.left != null) 
                leafSum(root.left, subsum); 
            if (root.right != null) 
               leafSum(root.right, subsum); 
            return ans; 
        } 
	}
	
	/*public void printLeaf(Node root){
		if(root==null){return;}
		if(root.left==null && root.right==null){
			System.out.print(root.data+" ");
		}
		printLeaf(root.left);
		printLeaf(root.right);
	}
	*/
	
	public static void main(String[] args)
	{
		
		PathFromRootWithSum tree = new PathFromRootWithSum(15);
		tree.insert(tree.root , 13);
		tree.insert(tree.root ,25);
		tree.insert(tree.root ,7);
		tree.insert(tree.root ,14);
		tree.insert(tree.root ,23);
		tree.insert(tree.root ,30);
		tree.insert(tree.root ,5);
		
		tree.inorder(tree.root);
		System.out.println("Print Leaf Nodes");
		tree.printLeaf(tree.root);
	}
}
	
	