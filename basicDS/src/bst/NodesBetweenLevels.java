import java.util.Queue;
import java.util.LinkedList;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data)
	{
		this.data = data;
	}
}

class NodesBetweenLevels{
	
	Node root;
	
	
	public NodesBetweenLevels(int data)
	{
		root = new Node(data);
	}
	
	//insert nodes
	public Node insert(Node root, int data)
	{
		if(root==null){
			root = new Node(data);
			return root;
		}
		
		if(root.data > data){
			root.left = insert(root.left, data);
		}
		if(root.data  < data){
			root.right = insert(root.right , data);
		}
		
		return root;
	}
	
	
	//print nodes between the given levels
	public void printlevelNodes(Node root , int beg ,int end){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int level = 1;
		//int nodeCount = q.size();
		
		
		while(1==1){
			int nodeCount = q.size();
			
			if(nodeCount==0){
				return;
			}
			
			while(nodeCount> 0 ){
				Node tmp = q.poll();
					if(beg<=level && level<=end){
					System.out.print(tmp.data+"  ");
					}
				if(tmp.left!=null){
					q.add(tmp.left);
				}
				if(tmp.right!=null){
					q.add(tmp.right);
				}
				nodeCount--;
			}
			level=level+1;
			System.out.println("");
		}
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
	
	
	//
	public static void main(String[] args){
		NodesBetweenLevels tree = new NodesBetweenLevels(20);
		tree.insert(tree.root, 8);
		tree.insert(tree.root, 22);
		tree.insert(tree.root, 4);
		tree.insert(tree.root, 12);
		tree.insert(tree.root, 10);
		tree.insert(tree.root, 14);
		
		tree.levelwise(tree.root);
		
		System.out.println("--------------------------");
		tree.printlevelNodes(tree.root ,1,2);
	}
}