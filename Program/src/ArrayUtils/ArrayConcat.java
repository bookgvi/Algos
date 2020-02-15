package ArrayUtils;


public class ArrayConcat {
    /**
     * Метод для объединения двух массивов в один
     *
     * @param A - массив №1
     * @param B - массив №2
     * @return - результат объединения А и В - новый массив
     */
    public static int[] concatTwoArrays(int[] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;
        int[] C = new int[aLen + bLen];
        System.arraycopy(A, 0, C, 0, aLen);
        System.arraycopy(B, 0, C, aLen, bLen);
        return C;
    }
}
