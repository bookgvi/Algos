package ArrayUtils;

public class ArrayPrepare {
    private final int size;
    private final int maxNumber;

    public ArrayPrepare(int sizeOfArray, int maxNumber) {
        this.size = sizeOfArray;
        this.maxNumber = maxNumber;
    }

    /**
     * Метод возвращает массив, заполненный случайными элементами, необходимые входные параметры
     * size - размер массива
     * maxNumber - макс число, которое может быть в качестве значения элемента массива
     * инициализируются в конструкторе
     *
     * @return - массив
     */
    public int[] getArray() {
        int[] arr = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] = (int) (Math.random() * this.maxNumber);
        }
        return arr;
    }
}
