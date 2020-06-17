/**
 * BC12M_copy_1606
 * 16.06.2020
 */
public class Ls39HW_SwanMain {
    public static void main(String[] args) {
        Ls39HW_Swan swanOne = new Ls39HW_Swan();
        swanOne.age = 3;
        swanOne.chicken = false;
        swanOne.color = "black";
        swanOne.weight = 8;

        Ls39HW_Swan swanTwo = new Ls39HW_Swan();
        swanTwo.age = 6;
        swanTwo.chicken = true;
        swanTwo.color = "white";
        swanTwo.weight = 15;

        Ls39HW_Swan swanThree = new Ls39HW_Swan();
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

        System.out.println("SwanThree is "+ swanThree.color + " and "+ swanThree.age + " years old, babies: " + swanThree.chicken);
        swanThree.canSwim();

    }
}
