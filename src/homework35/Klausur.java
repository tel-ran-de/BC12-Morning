package homework35;

/**
 * BC12-Morning
 * 11 17 : 19
 */
public class Klausur {
    public static void main(String[] args) {
        //basic - recursion -09
        String k = "ahixhi"; //1
        String l = "ahibhi"; //2
        String m = "xhixhi"; //0
        String o = "xabdxk"; //0
        String p = "xxxxxxahihi"; //2
        System.out.println("Решение recursion -1-09");
        System.out.println(countHi2(k));
        System.out.println(countHi2(l));
        System.out.println(countHi2(m));
        System.out.println(countHi2(o));
        System.out.println(countHi2(p));
        System.out.println("Конец решения recursion -1-09");

        // Exercises-Arrays-02-19
        int[] first = {3, 1, 3, 1, 3}; //true
        int[] second = {3, 1, 3, 3}; //false
        int[] third = {3, 4, 3, 3, 4}; //false
        System.out.println("Решение Exercises-Arrays-02-19");
        System.out.println(haveThree(first));
        System.out.println(haveThree(second));
        System.out.println(haveThree(third));
        System.out.println("Конец решения Exercises-Arrays-02-19");
    }
    // Exercises-Arrays-02-19
    // Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next
    // to each other

    private static boolean haveThree(int[] array) {
        boolean result = false;
        int digitCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 && i < array.length - 1) {
                if (array[i + 1] != 3) {
                    digitCount++;
                }
            }
        }
        if (array[array.length - 1] == 3 && array[array.length - 2] != 3) {
            digitCount++;
        }
        if (digitCount == 3) result = true;
        return result;
    }

    //basic - recursion -09
    // Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
    // count "hi" that have an 'x' immedately before them.
    private static int countHi2(String input) {
        String hi = "hi";
        char x = 'x';
        if (input.length() < 2) return 0;
        if (input.length() == 2) return (input.equals(hi)) ? 1 : 0;
        if (input.charAt(0) == x) {
            if (input.substring(1, 3).equals(hi)) return countHi2(input.substring(3));
            return countHi2(input.substring(1));
        }

        if (input.substring(0, 2).equals(hi)) return 1 + countHi2(input.substring(2));

        if (input.substring(1, 3).equals(hi)) return 1 + countHi2(input.substring(3));

        return countHi2(input.substring(2));
    }
}
