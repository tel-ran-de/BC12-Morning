package cw45.project;

import java.util.Date;

/**
 * BC12-Morning
 * 24 12 : 38
 */
public class Person {
    private String firstName;
    private int height;  //cm
    private double weight; //kg
    private Date birthDay;
    public Gender gender;
    // vers alpha 002, made 24 june 2020
    // 11.00.01
    private final long VERSION_PERS = 2020_06_24_00_00_02L;

    public Person() {
    }

    public Person(String firstName, int height, double weight,  Gender gender) {
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public long getVERSION_PERS() {
        return VERSION_PERS;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}


class PersonTest{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.gender = Gender.FEMALE;
    }
}