package ArrayUtils;

public class ArrayConcat {
    public int[] concatTwoArrays(int[] A, int[] B) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int aLen = A.length;
        int bLen = B.length;
        int[] C= new int[aLen+bLen];
        System.arraycopy(A, 0, C, 0, aLen);
        System.arraycopy(B, 0, C, aLen, bLen);
        return C;
    }
}
