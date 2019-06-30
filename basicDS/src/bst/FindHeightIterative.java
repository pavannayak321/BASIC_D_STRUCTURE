import java.util.LinkedList;
import java.util.Queue;



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


class FindHeightIterative
{
	Node root;
	
	public FindHeightIterative(int data)
	{
		root = new Node(data);
	}
	
	
	//insert elements
	public Node insert(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		
		//else reccur down the tree
		if(root.data  > data)
		{
			root.left  = insert(root.left , data);
		}
		else{
			root.right = insert(root.right , data);
		}
		return root;
	}
		
		
		//find height Iterative
		public int  findHeightItr(Node root)
		{
			if(root==null)
			{
				return 0;
			}
			//create an empty queue for level order traversal 
			
			Queue<Node> q = new LinkedList<Node>();
			//Enqueue root and intialize height as 0
			q.add(root);
			int height = 0;
			
			while(1==1)
			{
				int nodeCount = q.size();
				if(nodeCount==0)
				{
					return height;
				}
				height++;
			
				//Deque all nodes of current level and Enqueue the nodes of current level
				while(nodeCount >0)
				{
					Node newnode = q.peek();
					q.remove();
					
					if(newnode.left!=null)
					{
						q.add(newnode.left);
					}
					if(newnode.right!=null)
					{
						q.add(newnode.right);
					}
					nodeCount--;
				}
			}
			//return height;
		}
		
		
		
		public static void main(String[] args)
		{
			FindHeightIterative  itr =  new FindHeightIterative(51);
			itr.insert(itr.root , 32);
			itr.insert(itr.root , 37);
			int k = itr.findHeightItr(itr.root);
			System.out.println("Height of Tree is"+k);
		}
}