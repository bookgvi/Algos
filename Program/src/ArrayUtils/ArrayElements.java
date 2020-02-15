package ArrayUtils;

public class ArrayElements {
    public static boolean isEqual(int[] arr) {
        boolean isEqual = false;
        for (int i = 0, length = arr.length; i < length; i++) {
            isEqual = arr[0] == arr[i];
        }
        return isEqual;
    }
}
