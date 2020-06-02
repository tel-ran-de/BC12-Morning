import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Andrej";
        String[] array = name.split("");
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static void combsort(int[] args) {
        double stepConstant = 1.247330950103979;
        int step = args.length;
        boolean unsorted = true;
        int count = 0;
        while (unsorted) {
            if (step > 1) {
                step = (int) (step / stepConstant);
            }
            for (int i = 0, j = step; j < args.length; i++, j = 2 * j) {
                if (args[i] > args[j]) {
                    int temp = args[i];
                    args[i] = args[i + 1];
                    args[i + 1] = temp;
                    count++;
                }
            }
            if (count ==0){
                unsorted = false;
            }
        }
    }

    public static String[] bubbleSort(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1].toLowerCase().compareTo(array[i].toLowerCase()) < 0) {
                String tempStr = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tempStr;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
        return array;
    }
}
