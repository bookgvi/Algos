package Trees.BinaryTree;

public class Tree {
  private Node root;

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public void symmetricDetour(Node root) {
    if (root != null) {
      symmetricDetour(root.getLeftChild());
      System.out.printf("Node: %s%n", root.toString());
      symmetricDetour(root.getRightChild());
    }
  }

  public Node find(int id) {
    Node currentNode = root;
    while(currentNode.getId() != id) {
      if (id < currentNode.getId()) {
        currentNode = currentNode.getLeftChild();
      } else {
        currentNode = currentNode.getRightChild();
      }
      if (currentNode == null) return null;
    }
    return currentNode;
  }

  public void insert(Node node) {
    // Проверка на новое пустое дерево
    if (root == null) {
      root = node;
      return;
    }
    Node currentNode = root;
    while (true) {
      Node parent = currentNode;
      if (currentNode.getId() < node.getId()) {
        currentNode = currentNode.getLeftChild();
        if (currentNode == null) {
          // Вставить новый левый лист
          parent.setLeftChild(node);
          return;
        }
      } else {
        currentNode = currentNode.getRightChild();
        if (currentNode == null) {
          // Вставить новый правый лист
          parent.setRightChild(node);
          return;
        }
      }
    }
  }
}
