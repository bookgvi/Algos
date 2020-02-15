package ArrayUtils;

public class ArrayCopy extends ArrayConcat {

    /**
     * Уменьшение длинны массива
     *
     * @param source      - массив источник данных
     * @param sizeOfArray - какой размер (длинна) нужна в итоге
     * @return - на выходе массив с данными - int[]{source[0], ..., source[sizeOfArray]}
     */
    public static int[] reduceArray(int[] source, int sizeOfArray) {
        int[] target = new int[sizeOfArray];
        System.arraycopy(source, 0, target, 0, sizeOfArray);
        return target;
    }
}
