package HomeWork_Arrays_03_06;

/**
 * BC12-Morning
 * 23/06/2020  20:46
 */
public class HomeWork44MM {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] a2 = {1, 2, 1, 4};//------1 2 1 is a 'mirror' that is 3 characters long--no real mirror
        // 121 and 121 are the same from left to right and from right to left.... So length is 3.
        int[] a3 = {7, 1, 2, 9, 7, 2, 1};

        System.out.println(maxMirror(a1));//→ 3
        System.out.println(maxMirror(a2));// → 3
        System.out.println(maxMirror(a3));// → 2

    }

    public static int maxMirror(int[] array) {
        int count = 0;
        int max = 0; // max mirror
        for (int i = 0; i < array.length; i++) {// from beginning to the end
            count = 0;// start from new index
            // j must be greater than 1,and i(count-length of the mirror do not exceed the length of the array
            for (int j = array.length - 1; j > -1 && i + count < array.length; j--) {//from back to front
                if (array[i + count] == array[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);
        }

        return max;

    }


}
