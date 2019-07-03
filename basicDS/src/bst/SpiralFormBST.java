import java.util.Stack;
import java.util.*;


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

class SpiralFormBST
{
	Node root;
	
	public SpiralFormBST(int data){
		root =  new Node(data);
	}
	
	//insert node
	
	public Node insert(Node root ,int data)
	{
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
		if(root.data > data){
			root.left = insert(root.left , data);
		}
		if(root.data < data){
			root.right = insert(root.right , data);
		}
		
		return root;
	}
	
	
	//spiral form of BST using two stacks
	public void spiralBST(Node root)
	{
		Stack<Node> s1  = new Stack<Node>();
		Stack<Node> s2  = new Stack<Node>();
		
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			
			
			//Print nodes of  current level and push it on to the s2 stacks
			while(!s1.isEmpty()){
				Node tmp = s1.peek();
				s1.pop();
				System.out.print(tmp.data+" ");
				if(tmp.right!=null){		//-----------------------------------------IMP----------------------------R=L----------
					s2.push(tmp.right);
				}
				if(tmp.left!=null){
					s2.push(tmp.left);
				}
			}
			
			
			//print nodes from the stack2 and push the child elements to stack 1
			while(!s2.isEmpty()){
				Node tmp1 = s2.peek();
				s2.pop();
				System.out.print(tmp1.data+" ");
				if(tmp1.left!=null)
				{
					s1.push(tmp1.left);
				}
				if(tmp1.right!=null){
					s1.push(tmp1.right);
				}
			}
		}
	}
	
	
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
		SpiralFormBST bst =  new SpiralFormBST(10);
		bst.insert(bst.root ,2);
		bst.insert(bst.root , 29);
		bst.insert(bst.root , 1);
		//bst.insert(bst.root , 2);
		bst.insert(bst.root , 7);
		bst.insert(bst.root , 15);
		bst.insert(bst.root , 40);
		bst.insert(bst.root , 35);
		bst.spiralBST(bst.root);
		
		
		System.out.println("  ");
		bst.levelwise(bst.root);
	}
}
			
		