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
    double bmi;
    boolean matriculation;
    char selfTotem;

    public Person() {
        //Пустое
    }

    public Person(double personWeight, double personHeight) {
        weight = personWeight;
        height = personHeight;

        findBmiClassIndex();
    }

    public Person(String personName) {
        firstName = personName;
    }



    public void findBmiClassIndex() {
        double personWeight = weight;
        double personHeight = height / 100;

        bmi = personWeight / (personHeight * personHeight);

    }
}
