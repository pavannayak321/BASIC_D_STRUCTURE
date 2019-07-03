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


class PrintLevelOrder
{
	Node root;
	
	public PrintLevelOrder(int data)
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
			root.right =  insert(root.right  ,data);
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
		
		
	
	
	//main method 
	public static void main(String[] args)
	{
		PrintLevelOrder ordr  =  new PrintLevelOrder(15);
		ordr.insert(ordr.root  ,10);
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
	}
}
	