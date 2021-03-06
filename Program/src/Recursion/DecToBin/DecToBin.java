package Recursion.DecToBin;

import java.util.BitSet;
import java.util.Stack;

public class DecToBin {

  public Stack<Integer> convert(int decimal, Stack<Integer> result) {
    result.push(decimal % 2);
    if (decimal / 2 < 2) {
      result.push(decimal / 2);
      return result;
    }
    return convert(decimal / 2, result);
  }

  public Stack<Integer> shift(int decimal, Stack<Integer> result) {
    result.push(decimal & 1);
    int SHIFT_COUNT = 32;
    if (result.size() < SHIFT_COUNT) shift(decimal >> 1, result);
    return result;
  }

  public BitSet bitSet(int decimal, BitSet result, int i) {
    if (i == result.size()) return result;
    if ((decimal & 1) == 1) result.set(i);
    return bitSet(decimal >> 1, result, ++i);
  }
}
