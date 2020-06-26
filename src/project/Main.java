package project;

/**
 * BC12-Morning
 * 26 11 : 14
 */
public class Main {
    public static void main(String[] args) {
        Person igor = new Person("Игорь", 175, 100, Gender.MALE, 35);
        Alcohol beer = new Alcohol("Bier", 5, 1000.0);

        System.out.println("BAKformelWatson(igor, beer) " + BAKformelWatson(igor, beer));

    }


    public static double BAKformelWatson(Person person, Alcohol drink) {
        double height = person.getHeight();
        System.out.println("person.getHeight() " + person.getHeight());
        double weight = person.getWeight();
        System.out.println("person.getWeight() " + person.getWeight());
        double age = person.getAge();
        System.out.println("age " + age);
        //Gesamtkörperwasser GKW [Liter]
        double gkwMan = 2.447 - 0.09516 * age + 0.1074 * height + 0.3362 * weight;
        System.out.println("gkwMan " + gkwMan);
        double gkwFrau = -2.097 + 0.1069 * height + 0.2466 * weight;
        double gkwFrauModify = 0.203 - 0.07 * age + 0.1069 * height * 0.2466 * weight;

        double r = 1.055 * gkwMan / (0.8 * weight);

        double alcoholInGram = drink.findAlcoholInGram();
        System.out.println("alcoholInGram " + alcoholInGram); // ok
        return alcoholInGram / (weight * r);
    }
}
