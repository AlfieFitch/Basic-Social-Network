public class BST {
    
    private BSTNode root;

    public BST() {
        this.root = null;
    }

    public void insertColleague(Colleague c) {
        BSTNode newNode = new BSTNode(c);
        if (root == null) {
            root = newNode;
        } else {
            insert(root, newNode);
        }
    }

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
}

