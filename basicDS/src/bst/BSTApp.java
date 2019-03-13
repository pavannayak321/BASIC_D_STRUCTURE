package bst;


public class BSTApp {
	
	private static TreeNode root;
	
	class TreeNode
	{
		private TreeNode root;
		
		int data;
		TreeNode right;
		TreeNode left;
		
		
		public TreeNode(int data)
		{
			this.data = data;
		}
	}
		
		
	
	public void  createBinaryTree()
	{
		TreeNode first = new TreeNode(11);
		root = first;
		TreeNode second = new TreeNode(22);
		first.left = second;
		TreeNode third = new TreeNode(33);
		second.right = third;
		TreeNode fourth = new TreeNode(44);
		third.right = fourth;
		TreeNode fifth = new TreeNode(55);
		second.left = fifth;
	}
	
	
	
	public  void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}



	
	public static void main(String[] args) {
		BSTApp app = new BSTApp();
		app.createBinaryTree();
		app.preOrder(root);
	}
}
