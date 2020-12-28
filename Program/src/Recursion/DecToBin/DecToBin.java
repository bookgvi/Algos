package Recursion.DecToBin;

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
}
