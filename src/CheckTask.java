public class CheckTask {
    public static void main(String[] args) {
//05
        int[] a = new int[]{4, 5};
        int[] b = new int[]{4, 2};
        int[] c = new int[]{3, 5};
        System.out.println(isNo23InArray(a)); //true
        System.out.println(isNo23InArray(b)); //false
        System.out.println(isNo23InArray(c)); //false
        System.out.println("--------------");
        System.out.println(isNo23inArrayTwo(a)); //true
        System.out.println(isNo23inArrayTwo(b)); //false
        System.out.println(isNo23inArrayTwo(c)); //false
    }

    //05. Given an int array length 2, return true if it does not contain a 2 or 3.
    public static boolean isNo23InArray(int[] arr1) {
        for (int element : arr1) {
            //System.out.println("element = " + element);
            if (element == 2 || element == 3) return false;
        }
        return true;
    }

    public static boolean isNo23inArrayTwo(int[] arr1) {
        boolean result = false;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Элемент в фор: " + arr1[i]);

            if (arr1[i] != 2 || arr1[i] != 3) {
                System.out.println("Элемент в иф:" + arr1[i]);
                result = true;
            }


        }
        return result;
    }
}