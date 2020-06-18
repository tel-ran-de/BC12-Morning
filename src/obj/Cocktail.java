package obj;

/**
 * BC12-Morning
 * 18 10 : 37
 */
public class Cocktail {
    String name;
    Ingredient ingredient;

    Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
    }

    private void myPrint() {
        System.out.println("Ваш коктейль " + name + " готов");
    }

    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Vodka", 100);
        Ingredient rom = new Ingredient("Rom", 100);
        Ingredient cola = new Ingredient("Cola", 100);

        Cocktail javaBomba = new Cocktail("Бомба", vodka, rom, cola);

        javaBomba.myPrint();
    }


}

class Ingredient {
    String ingrTitle;
    int liquid;
    int krepost;
    boolean alcohol;

    Ingredient(String ingrTitle, int liquid) {
        this.ingrTitle = ingrTitle;
        this.liquid = liquid;
        System.out.println("Берём ингредиент " + ingrTitle + liquid + " мл");
    }
}
