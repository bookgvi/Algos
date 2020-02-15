package ArrayUtils;

public class ArrayCompareElements {
    /**
     * Проверка - все ли элементы массива одинаковы
     *
     * @param arr - массив для проверки
     * @return -  результат true/false (true - элементы массива одинаковые, иначе false)
     */
    public static boolean isEqual(int[] arr) {
        boolean isEqual = false;
        for (int value : arr) {
            isEqual = arr[0] == value;
        }
        return isEqual;
    }
}
