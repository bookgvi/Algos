package ArrayUtils;

public class ArrayCopy extends ArrayConcat {

    /**
     * Уменьшение длинны массива, убираем ненужное справа
     *
     * @param source      - массив источник данных
     * @param sizeOfArray - какой размер (длинна) нужна в итоге
     * @return - на выходе массив с данными - int[]{source[0], ..., source[sizeOfArray]}
     */
    public static int[] reduceArrayRight(int[] source, int sizeOfArray) {
        int[] target = new int[sizeOfArray];
        System.arraycopy(source, 0, target, 0, sizeOfArray);
        return target;
    }

    /**
     * Уменьшение длинны массива, убираем ненужное слева
     *
     * @param source    - массив из которого выбираем правые элемнты (начиная с startElem - 1)
     * @param startElem - элемент начиная с которого (-1!!!) нужно получить все остальные до конца
     * @return - новый массив
     */
    public static int[] reduceArrayLeft(int[] source, int startElem) {
        int srcLength = source.length;
        int targetLength = srcLength - startElem;
        int[] target = new int[targetLength];
        System.arraycopy(source, startElem - 1, target, 0, targetLength);
        return target;
    }
}
