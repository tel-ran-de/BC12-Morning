package Homework039;

/**
 * BC12M_copy_1606
 * 16.06.2020
 */
public class MainMasha {
    public static void main(String[] args) {
        SwanMasha swanOne = new SwanMasha();
        swanOne.age = 3;
        swanOne.chicken = false;
        swanOne.color = "black";
        swanOne.weight = 8;

        SwanMasha swanTwo = new SwanMasha();
        swanTwo.age = 6;
        swanTwo.chicken = true;
        swanTwo.color = "white";
        swanTwo.weight = 15;

        SwanMasha swanThree = new SwanMasha();
        swanThree.age = 15;
        swanThree.chicken = false;
        swanThree.color = "white";
        System.out.println();


        System.out.println("SwanOne is " + swanOne.color + " and " + swanOne.age + " years old, babies: " + swanOne.chicken);
        swanOne.canHiss();

        System.out.println("- - - - - - -");

        System.out.println("SwanTwo is " + swanTwo.color + " and " + swanTwo.age + " years old, babies: " + swanTwo.chicken);
        swanTwo.canHiss();
        swanTwo.canSwim();
        System.out.println("- - - - - - -");

        System.out.println("SwanThree is " + swanThree.color + " and " + swanThree.age + " years old, babies: " + swanThree.chicken);
        swanThree.canSwim();


        SwanMasha[] myFirstComplexArray = {swanOne, swanTwo, swanThree};


        int weightSwan2 = myFirstComplexArray[2].weight;
        boolean hasChildren1 = myFirstComplexArray[1].chicken;
    }
}
