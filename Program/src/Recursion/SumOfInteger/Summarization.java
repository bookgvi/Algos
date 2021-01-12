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

  /** Функция подсчета суммы натуральных чисел рекурсивным методом
   *
   * Декомпозиция рекурсивной функции до определения:
   *  для n == 1: 1;
   *  для четных значений: S(n) = 2*S(n/2) + Math.pow((n/2), 2);
   *  для нечетных значений: S(n) = 2*S((n-1)/2) + Math.pow((n/2), 2);
   *
   * графическое представление алгоритма:
   * e
   * oo
   * eee
   * +++o
   * +++ee
   * +++ooo
   * Math.pow((n/2), 2) - выражено квадратиком из плюсиков (ищем площадь квадрата)
   * 2*S(n/2) - суммы трегольников построенных из 'e' и 'o'
   *
   */
  int proceed1(int count) {
    if (count == 1) return 1;
    else {
      if ((count & -count) != count) { // Для нечетного числа - делаем четное, считаем для него и прибавляем его к конечному результату
        int evenCount = count - 1;
        return 2 * proceed1((int) evenCount / 2) + (int) Math.pow((int) (count / 2), 2.0) + count;
      } else {
        return 2 * proceed1((int) count / 2) + (int) Math.pow((int) (count / 2), 2.0);
      }
    }
  }

  int proceed(int[] array, int arraySize) {
    System.out.printf("Array: %s%n", Arrays.toString(array));
    if (arraySize == 1) return array[0];
    if ((arraySize & -arraySize) == arraySize) {
      array = Arrays.copyOfRange(array, 0, array.length / 2);
      arraySize = array.length;
      return 2 * proceed(array, arraySize) + (int) Math.pow(arraySize, 2);
    } else {
      int correction = array.length;
      array = Arrays.copyOfRange(array, 0, (array.length - 1)/ 2);
      arraySize = array.length;
      return 2 * proceed(array, arraySize) + (int) Math.pow((int) (correction / 2), 2) + correction;
    }
  }
}
