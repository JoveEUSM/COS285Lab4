/**
 * Prints the Binary Tree in Pre-Order traversal.
 * @author Taylor Brookes
 * @version 4 October 2023
 */
public class BTPrinting extends BinaryTree {
	public static void main(String[] args) {
		/**
		 * helper method
		 */
		private void preOrder(node<E> node) {
			if (node == null) return;
			System.out.print(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
		/**
		 * override testing method
		 */
		@Override
		protected void testing() {
			
		}
		/**
		 * this method prints the BinaryTree
		 * with Pre-Order traversal
		 */
		public void preOrder() {
			preOrder(root);
		}
		/**
		 * this method prints nodes on the leftmost
		 * path of a binary tree, starting from
		 * the lowest level all the way to the root
		 */
		public void printLeft() {
			
		}
		
		/**
		 * sample tree
		 */
		
	}
}
