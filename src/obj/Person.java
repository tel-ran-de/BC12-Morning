package obj;

/**
 * BC12-Morning
 * 16 11 : 08
 */
public class Person {
    String firstName;
    double weight;
    double height;
    int age;
    String gender;
    private double bmi;
    boolean matriculation;
    char selfTotem;

    public Person() {
        this.firstName = "Just student";
    }

    public Person(double personWeight, double personHeight) {
        this.weight = personWeight;
        this.height = personHeight;

        findBmiClassIndex();
    }

    public Person(String personName, double personWeight, double personHeight) {
        weight = personWeight;
        height = personHeight;
        this.firstName = personName;
        findBmiClassIndex();
    }

    public Person(String personName) {
        firstName = personName;
    }

    public double getBmi() {
        return bmi;
    }

    public void findBmiClassIndex() {
        double personWeight = weight;
        double personHeight = height / 100;

        bmi = personWeight / (personHeight * personHeight);
    }

    void myPrint() {
        System.out.println(firstName + " firstName "
                + "весит " + weight + " при росте " + height +
                "\n Индекс массы тела: " + bmi);
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person myLittlePerson = new Person("Сидоров", 90, 190);
        myLittlePerson.myPrint();

        System.out.println("БМИ вызванный через гетер " + myLittlePerson.getBmi());

    }
}

