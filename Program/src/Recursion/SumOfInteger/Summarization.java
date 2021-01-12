package Recursion.SumOfInteger;

import java.util.Arrays;
import java.util.stream.IntStream;

class Summarization {
  private int[] array;
  private int arraySize;

  Summarization(int n) {
    this(IntStream.rangeClosed(1, n).toArray());
  }

  private Summarization(int[] array) {
    this.array = array;
    this.arraySize = array.length;
  }

  void sum() {
//    int[] result = proceed(array, arraySize);
//    System.out.printf("Sum of %s integers = %s%n", arraySize, Arrays.toString(result));
    int result2 = proceed1(arraySize);
//    System.out.printf("%s%n", Arrays.toString(array));
    System.out.printf("Sum of %s integers = %s%n", arraySize, result2);
  }

  int proceed2(int count) {
    if (count == 1) return count;
    return proceed2(count - 1) + count;
  }

  int proceed1(int count) {
    int result = 1;
    if (count == 1) return result;
    else if ((count & -count) != count) {
      result = 2 * proceed1(count / 2) + ((count / 2) * (count / 2)) + count;
    } else {
      result = 2 * proceed1(count / 2) + ((count / 2) * (count / 2));
    }
    return result;
  }

  int proceed(int[] array, int arraySize) {
    System.out.printf("Array: %s%n", Arrays.toString(array));
    if (arraySize == 1) return array[0];
    array = Arrays.copyOfRange(array, 0, array.length / 2);
    arraySize = array.length;
    return 2 * proceed(array, arraySize) + ((arraySize / 2) * (arraySize / 2));
  }
}
