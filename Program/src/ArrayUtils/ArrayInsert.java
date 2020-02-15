package ArrayUtils;

public class ArrayInsert {
    public static int[] setElement(int[] arr, int val, int position) {
        int[] tmpArr = new int[arr.length + 1];
        if (position < 0) {
            position = 0;
        } else if (position > arr.length + 1) {
            position = arr.length;
        }
        System.arraycopy(arr, 0, tmpArr, 0, position);
        tmpArr[position] = val;
        System.arraycopy(arr, position, tmpArr, position + 1, arr.length - position);
        return tmpArr;
    }
}
