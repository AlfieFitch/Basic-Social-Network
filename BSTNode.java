public class BSTNode {
    private BSTNode l;
    private BSTNode r;
    private Colleague c;

    public BSTNode(Colleague c) {
        this.c = c;
    }

    public BSTNode getL() {
        return this.l;
    }

    public BSTNode getR() {
        return this.r;
    }

    public Colleague getC(){
        return this.c;
    }

    public void setL(BSTNode l) {
        this.l = l;
    }

    public void setR(BSTNode r) {
        this.r = r;
    }
}
