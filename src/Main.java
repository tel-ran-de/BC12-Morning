/**
 * BC12-Morning
 * 16 11 : 02
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(bmiIndex(175, 100));
        double h1 = 155;
        double m1 = 75;

        Person studentOne = new Person();
        studentOne.firstName = "Вася";
        studentOne.weight = 80;
        studentOne.height = 180;

        System.out.println(bmiIndex(studentOne.height, studentOne.weight));
    }

    private static double bmiIndex(double height, double weight) {
        height = height / 100;

        return weight / (height * height);
    }

}
