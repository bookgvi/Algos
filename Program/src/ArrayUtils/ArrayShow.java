package ArrayUtils;

public class ArrayShow {
    /**
     * Вывести содержимое массива в консоль
     *
     * @param arr - массив
     */
    public static void printArray(int[] arr) {
        String comma = ", ";
        int i = 0;
        for (int val : arr) {
            System.out.print(val + comma);
            i++;
            if (i >= arr.length - 1) {
                comma = "";
            }
        }
    }
}
