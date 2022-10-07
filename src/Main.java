/*

[1, 2, 3, 4, 5]


 */



public class Main {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 4, 2};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}