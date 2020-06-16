package imperative.sort.cocktail;

public class Remember {
    public static void main(String[] args) {
        helloChar();
    }

    private static void helloChar() {
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u039A';
        int i1, i2, i3;

        i1 = (int) a1;
        String s3 = String.valueOf(a3);
        System.out.println(i1);
        System.out.println(s3.charAt(0));
    }

}
