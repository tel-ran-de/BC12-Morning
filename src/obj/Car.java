package obj;

/**
 * BC12-Morning
 * 17 10 : 41
 */
public class Car {
    String modelName;
    String type;
    String motorID;
    String color = "серый";
    double volumeMotor;
    int tiles = 4;
    int doors = 5;
    int mileage;

    public Car() {
    }

    public Car(String newModelName,
               String type,
               String motorID,
               String color,
               double volumeMotor,
               int tiles,
               int doors,
               int mileage) {
        this.modelName = newModelName;
        this.type = type;
        this.motorID = motorID;
        this.color = color;
        this.volumeMotor = volumeMotor;
        this.tiles = tiles;
        this.doors = doors;
        this.mileage = mileage;
    }

    public Car(String factoryColor) {
        color = factoryColor;
    }

    public Car(int kolesa) {
        tiles = kolesa;
    }

    public Car(int newDoors, int kolesa) {
        doors = newDoors;
    }

    void move(int km) {
        System.out.println("Машина проехала " + km);
        mileage += km;
    }

    void paint(String newColor) {
        System.out.println("Машина успешно окрашена в " + newColor + " из " + color);
        color = newColor;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car myNewCar = new Car();
        myNewCar.move(100);
        System.out.println(myNewCar.mileage);

        myNewCar.move(400);
        System.out.println(myNewCar.mileage);
        myNewCar.paint("розовый");

        Car ferari = new Car("yellow");
        System.out.println(ferari.color);
    }
}