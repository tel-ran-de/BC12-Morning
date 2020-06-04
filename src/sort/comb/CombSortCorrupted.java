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
                if (array[i] > array[i + step]) {
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
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
