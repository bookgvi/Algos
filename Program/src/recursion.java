import Recursion.DecToBin.DecToBin;

import java.lang.reflect.Array;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Stack;

public class recursion {
  public static void main(String[] args) {
    final int DECIMAL_NUM = 14;
    Stack<Integer> result = new Stack<>();
    DecToBin decToBin = new DecToBin();
    result = decToBin.convert(DECIMAL_NUM, result);
    while (result.size() > 0) {
      System.out.print(result.pop());
    }
    System.out.println();
    result = decToBin.shift(DECIMAL_NUM, result);
    while (result.size() > 0) {
      System.out.print(result.pop());
    }
    System.out.println();
    BitSet bitSet = new BitSet();
    bitSet = decToBin.bitSet(DECIMAL_NUM, bitSet, 0);
    for (int i = bitSet.size() / 2 - 1; i >= 0; i--) {
      System.out.print(bitSet.get(i) ? 1 : 0);
    }
  }
}
