package obj;

/**
 * BC12-Morning
 * 17 09 : 39
 */
public class HelloString {
    public static void main(String[] args) {
        // String Pool
        String firstName1 = "Андрей";
        String firstName2 = "Андрей";
        String firstName3 = new String("Андрей");
        String firstName4 = new String("Андрей");

        System.out.println(firstName1 == firstName2);
        System.out.println("Объекты " + firstName3 == firstName4);
        System.out.println("Объект и литерал " + firstName1 == firstName3);
        System.out.println("---------------");
        System.out.println("Литералы " + firstName1.equals(firstName2));
        System.out.println("Объекты " + firstName3.equals(firstName4));
        System.out.println("Объект и литерал " + firstName1.equals(firstName3));
        System.out.println("---------------");
    }
}
