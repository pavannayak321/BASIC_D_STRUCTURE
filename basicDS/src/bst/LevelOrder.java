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



class LevelOrder{
	
	Node root;
	
	public LevelOrder(int data)
	{
		root = new Node(data);
	}
	
	
	//insert the node in BST
	public Node insertNode(Node root ,int data)
	{
		//Base case:= if root is null then create and assign Node 
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
		if(root.data > data)
		{
			root.left = insertNode(root.left , data);
		}
		if(root.data < data)
		{
			root.right = insertNode(root.right, data);
		}
	return root;
	}
	
	
	//method to print the  inorder traversal
	public void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
		
	} 
	

	//level order traversal
	public void levelOrder()
	{
		Queue<Node> q  =  new LinkedList<Node>();
		Queue<Node> q1 =  new LinkedList<Node>();
		q.add(root);
		q1.add(root); //---
		q.add(null);
		q1.add(null);  //-----
		
		while(!q.isEmpty())
		{
			
				Node tmp  = q.peek();
				
				if(tmp!=null)
				{
					System.out.print(tmp.data+"  ");
					if(tmp.left!=null)
					{
						q.add(tmp.left);
						q1.add(tmp.left);//----
					}
			
					if(tmp.right!=null)
					{
						q.add(tmp.right);
						q1.add(tmp.right); //----
					}
					Node tmp1 = q.poll();
				}
				if(tmp==null)
				{
					Node isnull = q.peek();
					if(isnull!=null)
					{
						q.add(null);
						q1.add(null);
					}
					
					q.poll();
					q1.add(null);
				}
				
		}
		System.out.println(q1);
	}
			
			
		
		
	public static void main(String[] args)
	{
		LevelOrder ordr = new LevelOrder(50);
		ordr.insertNode(ordr.root,31);
		ordr.insertNode(ordr.root,32);
		ordr.insertNode(ordr.root,57);
		
		ordr.inOrder(ordr.root);
		System.out.println("Level Order");
		ordr.levelOrder();
	}
}

