package cw45;

import java.util.ArrayList;
import java.util.Random;

/**
 * BC12-Morning
 * 24 09 : 44
 */
public class HelloArrayList {
    public static void main(String[] args) {
        // helloArrayList();
        // testMyArrayList();
        // arrayListMethods();
        arrayPrimitive();
    }

    private static void arrayPrimitive() {
        int myInt = 5;
        String s = "test";
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(myInt);
        Double myDouble;
        // Wrapper classes
        // byte -> Byte
        // short ->	Short
        // char	-> Character
        // int	-> Integer
        // long ->	Long
        // float -> Float
        // double -> Double
        // boolean	-> Boolean

    }

    private static void arrayListMethods() {
        ArrayList<String> germanCities = new ArrayList<>();
        String b = "berlin";
        String m = "münchen";
        String d = "dresden";
        germanCities.add(b);
        germanCities.add(m);
        germanCities.add(d);
        germanCities.add("leipzig");
        germanCities.add("potsdam");
        germanCities.add("frankfurt");
        // add(ElementDateType element)


        System.out.println(germanCities);
        germanCities.add("köln");
        germanCities.add("düsseldorf");
        System.out.println(germanCities);
        // germanCities.clear();
        System.out.println(germanCities);

        ArrayList<String> europeCities = (ArrayList<String>) germanCities.clone();

        System.out.println(europeCities);

        boolean capitalCheck = germanCities.contains("berlin");
        System.out.println(capitalCheck);
        boolean franceCapital = germanCities.contains("paris");
        System.out.println("Paris " + franceCapital);
        germanCities.ensureCapacity(500);
        germanCities.get(3);
        System.out.println(germanCities.isEmpty());
        ArrayList<String> netherLandsCities = new ArrayList<>();
        System.out.println(netherLandsCities.isEmpty());

        // String [] myArray = (String[]) germanCities.toArray();
        // System.out.println();
    }

    private static void testMyArrayList() {
        ArrayList<String> al = new ArrayList<>();
        int n = al.size(); // длина, размер
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.add(0, "Sergej");
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.add(0, "Юра");
        al.set(0, "Andrej");
        al.add(0, "Lena");
        al.set(0, "Sergej Makarovitch");
        String s = al.get(0);
        //al.set(5, "Sergej");
        al.add(7, "Ваня");
        al.add("Тётя клава");
        System.out.println(al);
        al.remove(5);
        System.out.println(al);
        al.remove("Юра");
        System.out.println(al);
    }

    private static String generateString(int n) {
        Random myRandom = new Random();
        String result = "";
        for (int i = 0; i < n; i++) {
            char c = (char) (myRandom.nextInt(25) + 65);  // (max - min) + min
            result = result + c;
        }
        return result;
    }


    private static void helloArrayList() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            String s = generateString(7);
            list.add(s);
        }
        System.out.println("Вариант 1 - " + list.toString());
        System.out.println("Вариант 2 - " + list);
        System.out.println("Вариант 3 - ");
        for (String littleS : list) {
            System.out.print(littleS + " ");
        }
        System.out.println();
        System.out.println("Вариант 4 - ");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).toLowerCase() + " ");
        }
    }


    private static void helloArray() {
        String[] myLittleStringArray = new String[10];
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<String> yourList = new ArrayList<>(myList);
        ArrayList<String> berliners = new ArrayList<>(3_500_000);
    }

}
