import java.util.*;



class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
	}
}

class LEFTViewDemo{
	Node root;
	
	LEFTViewDemo(){
		root = null;
	}
	
	//level order traversal
	public void leftView(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		if(root==null)
		{
			System.out.println("Create New Node");
		}
		//add root Node
		q.add(root);
		//add Null
		q.add(null);
		
		while(q.size()>0)
		{
			Node tmp =q.peek();
			
			if(tmp!=null) 		//check if node if null 
			{
				System.out.println(tmp.data);
				
				while(tmp!=null)
				{
					if(tmp.left!=null)
					{
						q.add(tmp.left);
					}
					if(tmp.right!=null)
					{
						q.add(tmp.right);
					}
					
					//remove the node after traversal
					q.remove();
					tmp = q.peek();
				}
				//if Encountered null value then
				q.add(null);
			}
			q.remove();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		LEFTViewDemo tree = new LEFTViewDemo();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(4);
		
		tree.root.right.left = new Node(5);
		tree.root.right.left.right = new Node(6);
		
		
		tree.root.right.left.right.left = new Node(7);
		tree.root.right.left.right.right = new Node(8);
		
		
		tree.leftView(tree.root);
	}
}
	