import java.util.*;



class Node{
	int 	data;
	Node    left;
	Node    right;
	
	public Node(int data)
	{
		this.data  = data;
		
	}
	
}
class BSTNodes{
	
	Node root;
	BSTNodes()
	{
		root = null;
	}
	
	
	//level order traversal using queue
	public void levelOrder()
	{
		if(root==null)
		{
			System.out.println("NEEd toCreate");
			
		}
		List list  =  new ArrayList();			//list.add(tmp.data);---------->to print the left view 
		
		Queue<Node> q =  new LinkedList<Node>();
		q.add(root);
		list.add(root.data);
		
			while(!q.isEmpty())
			{
				Node tmp  = q.poll();
				System.out.println(tmp.data);
				
				
				if(tmp.left!=null){
				q.add(tmp.left);
				list.add(tmp.left.data);	//list.add(tmp.data);---------->to print the left view 
				}
				
				if(tmp.right!=null){
					q.add(tmp.right);
					//list.add(tmp.right.data);
				}
				list.add(',');				//list.add(tmp.data);---------->to print the left view 
			}
	System.out.println(list);
	}
	
	public static void main(String[] args)
	{
		BSTNodes tree  =  new BSTNodes();
		tree.root = new Node(4);
		tree.root.left = new Node(5);
		tree.root.right =  new Node(2);
		tree.root.right.right = new Node(1);
		tree.root.right.left =  new Node(3);
		
		tree.root.right.left.left = new Node(6);
		tree.root.right.left.right =  new Node(7);
		
		
		
		
		tree.levelOrder();
	}
}