package BinaryTree;

public class Node implements INode{
    protected int id;
    protected int dd;
    protected INode leftChild;
    protected INode rightChild;

    @Override
    public int getDD() {
        return this.dd;
    }

    public int getID() {
        return this.id;
    }

    public INode getLeft() {
        return leftChild;
    }

    public INode getRight() {
        return rightChild;
    }

    public void setDD(int dd) {
        this.dd = dd;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setLeft(INode left) {
        this.leftChild = left;
    }

    public void setRight(INode right) {
        this.rightChild = right;
    }
}
