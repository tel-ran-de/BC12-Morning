package sort.comb;

public class CombSortCorrupted {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        myArrayPrint(comb(array));
    }

    private static int[] comb(int[] array) {
        double factor = 1.2473309;
        int step = array.length;
        boolean unsorted = true;

        while (unsorted || step != 1) {
            int count = 0;
            if (step > 1) {
                step = (int) (step / factor);
            }
            for (int i = 0; i < array.length - step; i++) {
                int j = i + step;
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return array;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.println(value);
        }
    }
}
