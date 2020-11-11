
import Trees.BinaryTree.Node;
import Trees.BinaryTree.Tree;

import java.io.IOException;
import java.util.Random;


public class Program {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        Tree tree = new Tree();
        for (int i = 1; i <= 10; i++) {
            Node node = new Node(rnd.nextInt(100), rnd.nextFloat());
            tree.insert(node);
        }
    }
}
