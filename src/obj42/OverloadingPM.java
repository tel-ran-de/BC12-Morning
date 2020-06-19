package obj42;

/**
 * BC12-Morning
 * 19 09 : 49
 */
public class OverloadingPM {
    public static void main(String[] args) {
        int a = 10;
        myPrint(a);
    }

    private static void myPrint(int digit) {
        System.out.println("Это цифра в методе майПринт " + digit);
    }

    private static void myPrint() {
        System.out.println("Это просто принт");
    }

    private static void myPrint(String s, int digit) {
        System.out.println("Это не просто принт, а принт со стрингом и интом");
    }

    private void info(){

    }
}
