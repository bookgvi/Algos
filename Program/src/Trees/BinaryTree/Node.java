package Trees.BinaryTree;

public class Node {
  private int id;
  private float data;
  private Node leftChild;
  private Node rightChild;

  public Node(int id, float data) {
    this.id = id;
    this.data = data;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public float getData() {
    return data;
  }

  public void setData(float data) {
    this.data = data;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(Node leftChild) {
    this.leftChild = leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public void setRightChild(Node rightChild) {
    this.rightChild = rightChild;
  }

  @Override
  public String toString() {
    return "Node: {" +
      "\n\tid: " + id +
      "\n\tdata: " + data +
    "\n}";
  }
}
