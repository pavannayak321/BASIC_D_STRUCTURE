import java.util.LinkedList;
import java.util.Queue;



class Node{
	int data;
	Node left;
	Node right;
	
	
	public Node(int data)
	{
		this.data  = data;
	}
}


class PrintAncestorOfNodes
{
	Node root;
	
	public PrintAncestorOfNodes(int data)
	{
		root = new Node(data);
	}
	
	
	//insert node in bst 
	public Node insert(Node root , int data)
	{
		if(root == null)
		{
			root = new Node(data);
		}
		if(root.data  < data)
		{
			root.right =  insert(root.right,data);
		}
		if(root.data  > data)
		{
			root.left = insert(root.left , data);
		}
	return root;
	}
	
	
	
	//Level wise Node printing 
	public void levelwise(Node root)
	{
		Queue<Node> q  = new LinkedList<Node>();
		q.add(root);
		
		while(1==1)
		{
			
			if(q.size()==0)
			{
			return;
			}
			
		int nodeCount = q.size();
		
			while(nodeCount>0)
			{
				Node tmp  = q.poll();
				nodeCount--;
				if(tmp.left!=null){
					q.add(tmp.left);
				}
				if(tmp.right!=null)
				{
					q.add(tmp.right);
				}
				System.out.print(tmp.data+"  ");
			}
			System.out.println("");
		}
	}
	//print ancestor of nodes 
	public boolean printAncestor(Node root , int target)
	{
		//base case if root is null
		if(root==null)
		{
			return false;
		}
		//if target is found then return true
		if(root.data == target)
		{
			return true;
		}
		
		boolean f_l = printAncestor(root.left ,target);
		boolean f_r = printAncestor(root.right ,target);
		
		if(f_l || f_r){
			System.out.print(root.data+"  ");
			return true;
		}
		
		return false;
	}
		
	
	
	//main method 
	public static void main(String[] args)
	{
		PrintAncestorOfNodes ordr  =  new PrintAncestorOfNodes(10);
		ordr.insert(ordr.root  ,25);
		ordr.insert(ordr.root  ,8);
		ordr.insert(ordr.root  ,12);
		ordr.insert(ordr.root  ,20);
		ordr.insert(ordr.root  ,30);
		ordr.insert(ordr.root  ,6);
		ordr.insert(ordr.root  ,9);
		ordr.insert(ordr.root  ,18);
		ordr.insert(ordr.root  ,22);
		
		ordr.levelwise(ordr.root);
		
		ordr.printAncestor(ordr.root , 20);
	}
}
	