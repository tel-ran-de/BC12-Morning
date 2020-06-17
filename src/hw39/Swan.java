package hw39;

public class Swan {
    int age;
    double ID;
    String color;
    boolean healthStatus;
    String gender;

    public Swan() {
        swim();
    }

    public Swan(int swanAge, double swanNumber, String color, String gender) {
        ID = swanNumber;
        age = swanAge;
        eat();
        System.out.println("Swan " + ID + " " + gender + ", " + age + " age, color is " + color);
    }


    public Swan(int swanAge, double swanNumber) {
        ID = swanNumber;
        age = swanAge;
        fly();
        fight(age);
        System.out.println("The swan " + ID + " healthy status is " + healthStatus);
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
