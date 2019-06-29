import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data = data;
	}
}


class ReverseLevelOrder{
	Node root;
	public ReverseLevelOrder(int data)
	{
		root = new Node(data);
	}
	
	
	
	//inserting the nodes in bst
	public Node insert(Node root , int data)
	{
		if(root  == null)
		{
			root = new Node(data);
		}
		
		
		if(root.data > data)
		{
			root.left = insert(root.left  , data);
		}
		if(root.data  < data)
		{
			root.right = insert(root.right , data);
		}
		return root;
	}
	
	
	
	//inorder traveersal 
	public void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+"   ");
		inorder(root.right);
	}
	
	//delete the nodes 
	public Node delete(Node root , int data)
	{
		if(root == null)
		{
			return root;
		}
		if(root.data < data)
		{
			root.right  = delete(root.right ,data);
		}
		else if(root.data  > data)
		{
			root.left = delete(root.left , data);
		}
		else
		{
			if(root.left==null && root.right == null)
			{
				return null;
			}
			if(root.left  == null && root.right!= null)
			{
				return root.right;
			}
			if(root.left!= null && root.right==null)
			{
				return root.left;
			}
			
			
			//case where we need to delete the node with two childrens
			root.data  = minValue(root);
			
			root.right = delete(root.right , root.data);
		}
		return root;
	}
	public int minValue(Node root)
	{
		int minval = root.data;
		while(root.left!=null)
		{
			minval = root.left.data;
			root = root.left;
		}
		return minval;
	}
	
	
	
	//Level order traversal 
	public void levelorder(Node root)
	{
		
		Queue<Node> q1 =  new LinkedList<Node>();
		Queue q2 = new LinkedList();
		
		q1.add(root);
		
		while(!q1.isEmpty())
		{
			Node tmp = q1.peek();
			
			if(tmp!=null)
			{
				if(tmp.left!=null)
				{
					q1.add(tmp.left);
				}
				if(tmp.right!=null)
				{
					q1.add(tmp.right);
				}
				
				Node r = q1.poll();
				System.out.println(r.data);
				q2.add(r.data);
			}
			
		}
		System.out.println(q2);
		
		List<Integer> l = new ArrayList(q2);
		Collections.reverse(l);
		System.out.println(l);
	}
				
				
				public static void main(String[] args)
				{
					ReverseLevelOrder rlevel = new ReverseLevelOrder(51);
					rlevel.insert(rlevel.root , 25);
					rlevel.insert(rlevel.root , 46);
					rlevel.insert(rlevel.root , 14);
					rlevel.insert(rlevel.root , 12);
					
					rlevel.inorder(rlevel.root);
					
					System.out.println('\n'+"Deleteing the node 14");
					rlevel.delete(rlevel.root ,14);
					
					rlevel.inorder(rlevel.root);
					
					System.out.println("level order ");
					rlevel.levelorder(rlevel.root);
				}
}
			
			
			
			
			
			
			
			
		
		
		
	