package Sort;

public class BubbleSort implements Execute {
    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    private int[] makeSort(int[] arr) {
        final int arrLength = arr.length;
        for(int k = arrLength - 1; k > 1; k--) {
            for (int i = 0; i < k; i++) {
                if (arr[i] >= arr[i + 1]) {
                    this.swap(i, i + 1);
                }
            }
        }
        return arr;
    }

    private void swap(int x, int y) {
        arr[y] = arr[y] ^ arr[x];
        arr[x] = arr[x] ^ arr[y];
        arr[y] = arr[y] ^ arr[x];
    }
        @Override
        public int[] exec () {
            return this.makeSort(this.arr);
        }
    }
