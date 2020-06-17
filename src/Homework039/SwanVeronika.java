package Homework039;

public class SwanVeronika {
    int age;
    double qrCode;
    boolean healthStatus;
    String gender;
    String color;

    public SwanVeronika() {
        swim();
    }

    public SwanVeronika(int swanAge, double swanNumber, String color, String gender) {
        qrCode = swanNumber;
        age = swanAge;
        eat();
        System.out.println("Swan " + qrCode + " " + gender + ", " + age + " age, color is " + color);
    }


    public SwanVeronika(int swanAge, double swanNumber) {
        qrCode = swanNumber;
        age = swanAge;
        fly();
        fight(age);
        System.out.println("The swan " + qrCode + " healthy status is " + healthStatus);
    }

    void fly() {
        System.out.println("I'm flying");
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    void bit() {
        System.out.println("I'm biting you!");
    }

    void eat() {
        System.out.println("I'm eating! Om-nom-nom!");
    }

    void fight(int swanAge) {
        age = swanAge;
        if (age < 3) {
            bit();
            healthStatus = true;
        } else {
            swim();
            System.out.println("You are winning, I'm going away");
            healthStatus = false;
        }
    }
}
