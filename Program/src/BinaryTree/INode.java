package BinaryTree;

public interface INode {
    int getDD();
    int getID();
    INode getLeft();
    INode getRight();
    void setDD(int dd);
    void setID(int id);
    void setLeft(INode left);
    void setRight(INode right);
}
