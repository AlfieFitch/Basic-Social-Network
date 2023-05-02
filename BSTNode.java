/**
 * A class that implements a BST Node. 
 * @author AFitchMay
 */

public class BSTNode {
    /**
     * Attributes required for the class.
     */
    private BSTNode l;
    private BSTNode r;
    private Colleague c;

    /**
     * Constructor for the BSTNode class.
     * @param c - the colleague to be added to the BSTNode
     */
    public BSTNode(Colleague c) {
        this.c = c;
    }

    /**
     * Getter for the Left child of the current Colleague.
     * @return the left child of the current Colleague
     */
    public BSTNode getL() {
        return this.l;
    }

    /**
     * Getter for the Right child of the current Colleague.
     * @return the right child of the current Colleague
     */
    public BSTNode getR() {
        return this.r;
    }

    /**
     * Getter for the Colleague of the current BSTNode.
     * @return the Colleague of the current BSTNode
     */
    public Colleague getC(){
        return this.c;
    }

    /**
     * Setter for the Left child of the current Colleague.
     * @param l - the left child of the current Colleague
     */
    public void setL(BSTNode l) {
        this.l = l;
    }

    /**
     * Setter for the Right child of the current Colleague.
     * @param r - the right child of the current Colleague
     */
    public void setR(BSTNode r) {
        this.r = r;
    }
}
