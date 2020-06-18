package obj;

import java.util.Date;

public class Cat {
    private String name;
    private double price = 100.0;
    private String breed;
    private Date birthDate;
    private String color;
    private boolean passport;
    private String gender;
    private double weight;
    private double height;
    private int chipNumber;
    private Address address;


    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

}

class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Тигр");
        System.out.println(cat.getName());
        cat.setPrice(200);
    }
}


class Address {
    String city;
    String street;
    int houseNumber;
    int zip;

    Address(int zip, String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.houseNumber = houseNumber;
    }
}