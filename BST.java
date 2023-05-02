/**
 * A Class that implements a Binary Search Tree using BSTNodes and the Colleague Class.
 * @author AFitchMay
 */

public class BST {
    /**
     * Attributes required for the class.
     */
    private BSTNode root;

    /**
     * Constructor for the BST class - Sets the root attribute to null.
     */
    public BST() {
        this.root = null;
    }

    /**
     * Method to insert a new colleague into the BST.
     * @param c - the colleague to be inserted into the BST
     */
    public void insertColleague(Colleague c) {
        BSTNode newNode = new BSTNode(c);
        if (root == null) {
            root = newNode;
        } else {
            insert(root, newNode);
        }
    }

    /**
     * Helper Method to insert a new BSTNode into the BST.
     * Use recursive method to ensure the node is placed in the correct place.
     * has 2 base cases if the left or right child is null, then the new node is inserted there.
     * @param currentNode - the current BSTNode
     * @param newNode - the new BSTNode to be inserted
     */
    private void insert(BSTNode currentNode, BSTNode newNode) {
        
        int compareValue = newNode.getC().getUserName().compareToIgnoreCase(currentNode.getC().getUserName());

        if (compareValue < 0) {
            if (currentNode.getL() == null) {
                currentNode.setL(newNode);
            } else {
                insert(currentNode.getL(), newNode);
            }

        } else if (compareValue > 0) {
            if (currentNode.getR() == null) {
                currentNode.setR(newNode);
            } else {
                insert(currentNode.getR(), newNode);
            }

        } else {
            if (currentNode.getL() == null) {
                currentNode.setL(newNode);
            } else {
                insert(currentNode.getL(), newNode);
            } 
        }
    }

    /**
     * Method that prints the BST in reverse alphabetic order.
     * @return sb - the string of usernames in reverse alphabetic order  
    */
    public String printReverseAlphabetic(){
        StringBuilder sb = new StringBuilder();
        traverseNode(root, sb);
        return sb.toString();
    }

    /**
     * Helper Method to traverse the BST in reverse alphabetic order.
     * Use recursive method to ensure the nodes are printed in the correct order and all nodes are printed.
     * Only one base case is if the current node is null.
     * @param node - the current BSTNode
     * @param usernames - the string of usernames in reverse alphabetic order
     */
    private void traverseNode(BSTNode node, StringBuilder usernames) {
        if (node != null) {
            traverseNode(node.getR(), usernames);  // traverse right subtree
            usernames.append(node.getC().getUniqueUserName() + "\n");  // print current node
            traverseNode(node.getL(), usernames);  // traverse left subtree
        }
    }
}

