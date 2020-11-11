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
    while (currentNode.getId() != id) {
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
      node.setParentNode(parent);
      if (currentNode.getId() > node.getId()) {
        currentNode = currentNode.getLeftChild();
        if (currentNode == null) {
          // Вставить новый левый лист
          parent.setLeftChild(node);
          return;
        }
      } else if (currentNode.getId() == node.getId()) {
        return;
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

  public void delete(Node node) {
    Node deletedNode = this.find(node.getId());
    if (deletedNode == null) return;

    Node parentNode = deletedNode.getParentNode();

    /*
     * Блок удаления ноды у которой один потомок или нет ни одного
     * */
    if (deletedNode.getLeftChild() == null) { // Если у удаляемой ноды нет левого потомка, то
      Node newNode = deletedNode.getRightChild(); // берем правого потомка, и
      this.setNewNode(deletedNode, parentNode, newNode); // у родителя заменяим ноду на него
    } else if (deletedNode.getRightChild() == null) { // Если у удаляемой ноды нет правго потомка, то
      Node newNode = deletedNode.getLeftChild(); // берем левого потомка, и
      this.setNewNode(deletedNode, parentNode, newNode); // у родителя заменяим ноду на него
    } else if (deletedNode.getRightChild() == null & deletedNode.getLeftChild() == null) {
      this.setNewNode(deletedNode, parentNode, null); // если удаляема нода - лист, то у родителя просто отмечаем null
    } else {
      /*
       * Блок удаления ноду у которой 2 потомка
       * Алгоритм поиска приемника (successor) - приемником стаановится тот элемент, у которого нет левых потомков
       * Successor переносится на место удаляемого элемента
       * на место Successor устанавливается его правый потомок (при наличии такового)
       * */
      Node successor = findSuccessor(node); // У приемника всега левый потомок == null
      if (successor.getRightChild() == null) { // Если преемник - лист, то
        successor.getParentNode().setLeftChild(null); // удаляем его у родителького элемента,
        this.setNewSuccessor(deletedNode, parentNode, successor); // и устанавливаем на его место приемника
      } else { // у приемника есть потомки (справа)
        Node successorRightChild = successor.getRightChild();
        Node successorParent = successor.getParentNode();
        if (successor.getParentNode() != deletedNode) {
          successorParent.setLeftChild(successorRightChild); // на место приемника ставим его правого потомка
        }
        this.setNewSuccessor(deletedNode, parentNode, successor); // а приемника ставим на место удаленного элемента
      }
    }
  }

  private void setNewNode(Node deletedNode, Node parentNode, Node newNode) {
    if (parentNode.getLeftChild() == deletedNode) parentNode.setLeftChild(newNode);
    else parentNode.setRightChild(newNode);
  }

  private void setNewSuccessor(Node deletedNode, Node parentNode, Node successor) {
    setNewNode(deletedNode, parentNode, successor); // переносим на место удаленного
    successor.setLeftChild(deletedNode.getLeftChild()); // присоединяем левых
    if (successor.getParentNode() != deletedNode) {
      successor.setRightChild(deletedNode.getRightChild()); // и правых потомков удаленного элемента
    }
  }

  private Node findSuccessor(Node deletedNode) {
    Node subRoot = deletedNode.getRightChild();
    Node successor;
    do {
      successor = subRoot;
      subRoot = subRoot.getLeftChild();
    } while (subRoot != null);
    return successor;
  }

}
