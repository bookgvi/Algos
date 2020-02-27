package BinaryTree;

public class Tree implements Find, Insert, Delete {
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

    public void delete(int id) {
        if (root == null)
            return;
        INode current = root;
        INode parent  = root;
        boolean isLeft = true;
        while (id != current.getID()) {
            parent = current;
            if (id < current.getID()) {
                isLeft = true;
                current = current.getLeft();
            } else if (id > current.getID()) {
                isLeft = false;
                current = current.getRight();
            }
            if (current == null)
                return;
        }
        if (current.getLeft() == null && current.getRight() == null) {
            if (isLeft) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (current.getLeft() != null) {
            if (isLeft) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else if (current.getRight() != null) {
            if (isLeft) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else {
//            TODO
//            INode successor = findSuccessor();
        }
    }
}
