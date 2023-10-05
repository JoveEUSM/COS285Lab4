public class BinaryTree {

	/*
	 * The root node for this binary tree.
	 * May have up to two children nodes, as with other binary tree nodes
	 */
	protected node<Integer> root;

	//Nested node class for this binary tree
	public static class node<Integer>{
		//The data of this node. A simple int
		private int data;
		//The left child node of this node, if there is one.
		private node<Integer> left;
		//The right child node of this node, if there is one.
		private node<Integer> right;
		
		public node(int data, node<Integer> left, node<Integer> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		
		
		
		
	}
	
	
	/*
	 * Method for testing the subtask methods. Left empty to be overriden later.
	 */
	protected void testing() {
	}
	
	
	
}
