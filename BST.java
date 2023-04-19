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
        if (newNode.getC().getUserName().compareTo(currentNode.getC().getUserName()) < 0) {
            if (currentNode.getL() == null) {
                currentNode.setL(newNode);
            } else {
                insert(currentNode.getL(), newNode);
            }
        } else {
            if (currentNode.getR() == null) {
                currentNode.setR(newNode);
            } else {
                insert(currentNode.getR(), newNode);
            }
        }
    }
}

