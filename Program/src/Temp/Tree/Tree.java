package Temp.Tree;

public class Tree implements Find, Insert {
    private Node root;

    public Tree() {
        this.root = null;
    }

    @Override
    public INode find(int key) {
        INode current = root;
        while(current.id != key) {
            if (current.leftChild.id > key)
                current = current.rightChild;
            else
                current = current.leftChild;
            if (current == null)
                return null;
        }
        return current;
    }

    public void insert(int key, int dd) {
        Node node = new Node();
        node.id = key;
        node.dd = dd;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key > current.id) {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
                else {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                }
            }
        }
    }
}
