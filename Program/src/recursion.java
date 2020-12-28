import Recursion.DecToBin.DecToBin;

import java.util.Stack;

public class recursion {
  public static void main(String[] args) {
    final int DECIMAL_NUM = 14;
    Stack<Integer> result = new Stack<>();
    DecToBin decToBin = new DecToBin();
    result = decToBin.convert(DECIMAL_NUM, result);
    while(result.size() > 0) {
      System.out.print(result.pop());
    }
    System.out.println();
    result = decToBin.shift(DECIMAL_NUM, result);
    while(result.size() > 0) {
      System.out.print(result.pop());
    }
  }
}