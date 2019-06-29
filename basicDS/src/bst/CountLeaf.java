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

class CountLeaf{
	Node root;
	
	public CountLeaf(int data)
	{
		root = new Node(data);
	}
	
	//insert node
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
	
	
	
	//counting the leaf nodes  in recursive way 
	public int  countleaf(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right == null)
		{
			return 1;
		}
		else
		return countleaf(root.left)+countleaf(root.right);
	}
	
	
	
	//counting the leaf nodes using the queue data structure
	public void count(Node root)
	{
		int count = 0;
		Queue<Node>  q =  new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node tmp = q.peek();
			
			if(tmp.left!=null)
			{
				q.add(tmp.left);
			}
			if(tmp.right!=null)
			{
				q.add(tmp.right);
			}
			Node rt = q.poll();
			System.out.println(rt.data);
			if(rt.left==null  && rt.right==null)
			{
				count = count+1;
			}
		}
		System.out.println(count);
	}
		
	public static void main(String[] args)
	{
		CountLeaf lfc = new CountLeaf(4);
		lfc.insert(lfc.root  , 1);
		lfc.insert(lfc.root  , 7);
		lfc.insert(lfc.root  , 3);
		lfc.insert(lfc.root  , 2);
		lfc.insert(lfc.root  , 6);
		
		int c = lfc.countleaf(lfc.root);
		System.out.println(c);
		
		
		lfc.count(lfc.root);
	}
}