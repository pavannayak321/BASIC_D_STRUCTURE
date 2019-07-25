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
class RecLevelOrder
{
	Node root;
	public RecLevelOrder(int data)
	{
		if(root==null)
		{
			root = new Node(data);
		}
	}
	
	
	//insert node in the tree
	/*public Node insert(Node root  , int data)
	{
		if(root==null)
		{
			root  = new Node(data);
		}
		if(root.data  < data)
		{
			root.right = insert(root.right  , data);
		}
		if(root.data > data){
			root.left = insert(root.left  , data);
		}
		return root;
	}*/
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
	
	public void inOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	//
	public void printLevelOrder()  
    { 
        Queue<Node> queue = new LinkedList<Node>(); 
        queue.add(root); 
        while (!queue.isEmpty())  
        { 
  
            /* poll() removes the present head. 
            For more information on poll() visit  
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll(); 
            System.out.print(tempNode.data + " "); 
  
            /*Enqueue left child */
            if (tempNode.left != null) { 
                queue.add(tempNode.left); 
            } 
  
            /*Enqueue right child */
            if (tempNode.right != null) { 
                queue.add(tempNode.right); 
            } 
        }
	}
	
	public void printlevel(Node root){
		Queue<Node> q   = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node tmp = q.poll();
			System.out.print(tmp.data+" ");
			if(tmp.left!=null)
			{
				q.add(tmp.left);
			}
			if(tmp.right!=null)
			{
				q.add(tmp.right);
			}
		}
	}
	
	/*
	public void  RecLevelorder(Node root)
	{
		//find the height
		int h = findHeight(root);
		for(int i=1;i<=h;i++)
		{
			printGivenLevel(root , h);
		}
	}
	*/
	void RecLevelorder(Node root) 
	{ 
		int h = findHeight(root); 
		int i; 
		for (i=1; i<=h; i++) 
			printGivenLevel(root, i); 
	} 

	/*public int findHeight(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int lheight = findHeight(root.left);
		int rheight  = findHeight(root.right);
		
		if(lheight > rheight)
		{
			return lheight+1;
		}
		else{
			return rheight+1;
		}
	}*/
	int findHeight(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = findHeight(root.left); 
            int rheight = findHeight(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
	//print the level elements tree
	/*public void printLevelEle(Node root , int level)
	{
		if(root==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(root.data+" ");
		}
		else if(level>1)
		{
			printLevelEle(root.left , level-1);
			printLevelEle(root.right , level-1);
		}
	}
	*/
	public void printGivenLevel(Node node, int level)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1)  
        { 
            printGivenLevel(node.left, level - 1); 
            printGivenLevel(node.right, level - 1); 
        } 
    } 
	
	
	//public method
	public static void main(String[] args)
	{
		RecLevelOrder tree  =  new RecLevelOrder(1);
		tree.insert(tree.root  , 2);
		tree.insert(tree.root , 5);
		tree.insert(tree.root  ,3);
		tree.insert(tree.root , 6);
		tree.insert(tree.root  ,4);
		
		tree.inOrder(tree.root);
		
		tree.printLevelOrder();
		
		
		tree.printlevel(tree.root);
		
		System.out.println("---");
		System.out.println("----");
		tree.RecLevelorder(tree.root);
		
	//System.out.println(tree.findHeight(tree.root));
	}
}
		
	