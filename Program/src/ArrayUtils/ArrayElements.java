package ArrayUtils;

public class ArrayElements {
    /**
     * Проверка - все ли элементы массива одинаковы
     *
     * @param arr - массив для проверки
     * @return -  результат true/false (true - элементы массива одинаковые, иначе false)
     */
    public static boolean isEqual(int[] arr) {
        boolean isEqual = false;
        for (int i = 0, length = arr.length; i < length; i++) {
            isEqual = arr[0] == arr[i];
        }
        return isEqual;
    }
}
