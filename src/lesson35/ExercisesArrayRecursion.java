package lesson35;

/**
 * BC12-Morning
 * 6/11/20 10: 58
 */
public class ExercisesArrayRecursion {
    public static void main(String[] args) {
        //basic - recursion -08
//        String a = "abc"; //1
//        String b = "abcxxabc"; //2
//        String c = "abaxxaba"; //2
//        System.out.println(countAbc(a));
//        System.out.println(countAbc(b));
//        System.out.println(countAbc(c));
        //helloSubstring();

        //basic - recursion -09
        String k = "ahixhi"; //1
        String l = "ahibhi"; //2
        String m = "xhixhi"; //0
//        String o = "xabdxk"; //0
//        String p = "xxxxxxahihi"; //2
//        System.out.println(countHi2(k));
//        System.out.println(countHi2(l));
//        System.out.println(countHi2(m));
//        System.out.println(countHi2(o));
//        System.out.println(countHi2(p));

        // Exercises-Arrays-02-18
//        int[] aa = {7, 1, 7}; // true
//        int[] ab = {1, 7, 1, 7}; //true
//        int[] ac = {1, 7, 1, 1, 7}; //false
//        System.out.println(has77(aa));
//        System.out.println(has77(ab));
//        System.out.println(has77(ac));
// Exercises-Arrays-02-19
        int[] first = {3, 1, 3, 1, 3}; //true
        int[] second = {3, 1, 3, 3}; //false
        int[] third = {3, 4, 3, 3, 4}; //false

        System.out.println(haveThree(first));
//        System.out.println(haveThree(second));
//        System.out.println(haveThree(third));

    }

    // Exercises-Arrays-02-19
// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next
// to each other
    private static boolean haveThree(int[] array) {
        int count = 0;
        int three = 3;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == three) {
                if (array[i + 1] != three && i < array.length-1) {
                    count++;
                    System.out.println(count);
                } else {
                    return false;
                }

            }

        }
        return count == three;
    }

    // Exercises-Arrays-02-18
    // Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
    // separated by one element, such as with {7, 1, 7}.
    private static boolean has77(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == 7) {

                if (array[i + 1] == 7 || array[i + 2] == 7) {
                    return true;
                }

            }

        }
        return false;
    }

    //basic - recursion -09
    // Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
    // count "hi" that have an 'x' immedately before them.
    private static int countHi2(String input) {
        String hi = "hi";
        char x = 'x';
        String checkString;
        if (input.length() < 2) return 0;
        checkString = input.substring(0, 2);
        if (checkString.equals(hi)) {
            return 1 + countHi2(input.substring(2));
        }
        if (input.charAt(0) == x) {
            if (input.substring(1, 3).equals(hi)) {
                return countHi2(input.substring(3));
            } else {
                return countHi2(input.substring(1));
            }

        }
        return countHi2(input.substring(1));
    }

    //basic - recursion -08
    // Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
    private static int countAbc(String input) {
        String abc = "abc";
        String aba = "aba";
        String checkString;
        if (input.length() < 3) return 0;
        checkString = input.substring(0, 3);
        if (checkString.equals(aba) || checkString.equals(abc)) {
            return 1 + countAbc(input.substring(3));
        }

        return countAbc(input.substring(1));
    }

    public static void helloSubstring() {
        String test = "добро пожаловать";
        String test1 = test.substring(0, 5);
        String test2 = test.substring(5);
        System.out.println(test1);
        System.out.println(test2);
    }


}
