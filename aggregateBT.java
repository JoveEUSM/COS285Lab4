/**
 * A class with methods to find the maximum value in a binary tree and sums
 * all lesser values of an integer within a binary tree
 * @author Madalyn Amero
 * @version 4 October 2023
 */

public class aggregateBT extends BinaryTree {

	/**
	 * Returns the summation of values less than the integer item in the tree
	 * @param item the integer value in which we are searching the tree for lesser values
	 */
	public int sumLessThan(int item) {
		if (node==null) {
			return 0;
		}
		return sumLessThan(node.right, item)+sumLessThan(node.left, item);
	}

	/**
	 * A helper method to sum the values less than the integer item in a tree
	 * @param n the node we are examinign
	 * @param item the integer value in which we are searching the tree for lesser values
	 */
	public int sumLessThan(node n, int item) {
		int sum = 0;
		
		if (n.data < item) {
			sum+=n.data;
		}
		if (n.right!=null) {
			return sumLessThan(n.right, item);
		}
		if (n.left!=null) {
			return sumLessThan(n.left, item);
		}
		return sum;
	}
	
	/**
	 * Returns the maximum value in the tree
	 */
	public int findMax() {
		if (node==null) {
			return null;
		}
		return findMax(node.right);
	}
	
	/**
	 * A helper method to find the maximum number in the tree
	 * @param n the node we are examining
	 */
	public int findMax(node n) {
		if (node.right==null) {
			return node.data;
		}
		return findMax(node.right);
	}
	
	@Override
	protected void testing() {
	}
