/**
 * searchBT - BinaryTree class that recursively searches through the tree
 * @author Ellis Fitzgerald
 * @version 
 *
 */
public class searchBT extends BinaryTree {
    
    /**
     * @author Ellis Fitzgerald
     * @param item - The target to search for in searchBT
     * @return true or false depending on if the item is found in searchBT
     */
    public boolean contains(int item) {
        return contains(root, item);
    }
    
    /**
     * @author Ellis Fitzgerald
     * @param localRoot - The currently local root that will be used to reference
     * @param item - The target to search for in searchBT
     * @return true or false depending on if the item is found in searchBT
     */
    private boolean contains(node localRoot, int item) {
        if(localRoot == null) {
            return false;
        }
        else if(localRoot.data == item) {
            return true;
        }
        else {
            return (contains(localRoot.left, item) || contains(localRoot.right, item));
        }
    }
    
    /**
     * @author Ellis Fitzgerald
     * @param item - The target to search for in searchBT
     * @return The level {@coden} that item is found in or {@code-1} if not found
     */
    public int getLevel(int item) {
        return getLevel(root, item, 1);
    }
    
    private int getLevel(node localRoot, int item, int currentLevel) {
        if (localRoot == null){
            return -1;
        }
        else if(localRoot.data == item) {
            return currentLevel;
        }
        else {
            int leftLevel = getLevel(localRoot.left, item, currentLevel + 1);
            if(leftLevel != -1) {
                return leftLevel;
            }
            return getLevel(localRoot.right, item, currentLevel + 1);
        }
    }
    

}
