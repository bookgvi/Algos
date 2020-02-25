package BinaryTree;

public class Tree implements Find, Insert {
    private INode root;

    public Tree() {
        this.root = null;
    }

    @Override
    public INode find(int key) {
        INode current = root;
        while (current.getID() != key) {
            if (key < current.getID()) {
                current = current.getLeft();
            } else if (key > current.getID()){
                current = current.getRight();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, int dd) {
        INode newNode = new Node();
        newNode.setDD(dd);
        newNode.setID(id);
        if (root == null) {
            root = newNode;
            return;
        }
        INode current = root;
        INode parent = null;
        while(true) {
            parent = current;
            if (id < current.getID()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else if (id > current.getID()) {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }
}
