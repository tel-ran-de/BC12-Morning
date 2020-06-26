/*
package project;

public class BAKBerechnung {

    public static double findPromille(double reduktionsFaktor, Person user, Alkohol drink) {
        double promilleWindmark =
                drink.findAlkoholInGramm() / (user.getGewicht() * findReduktionsFaktorArithmetischesMittel(user));

        return promilleWindmark;
    }

    public static double findReduktionsFaktorArithmetischesMittel(Person user) {
        //ReduktionsFaktorArithmetischesMittel
        double mittelWert;
        //Uno
        double redFakWindmark;
        double gewicht = user.getGewicht();
        double hight = user.getHeight();
        double alter = user.calculateAge();

        if (alter < 20 && user.getGender().equals(Gender.W)) redFakWindmark = 0.55;
        if (alter > 20 && user.getGender().equals(Gender.M)) redFakWindmark = 0.7;
        else redFakWindmark = 0.6;

        //Two
        double redFakSeidl;
        if (user.getGender().equals(Gender.M)) redFakSeidl =
                0.31233 - 0.004821 * gewicht + 0.004432 * hight;
        else redFakSeidl = 0.31233 - 0.006446 * gewicht + 0.004466 * hight;

        //Three			Ulrich - for man only
        double redFakUlrich = 0.715 - 0.00462 * gewicht + 0.0022 * hight;

        //FOR Danger GKW
        double redFakWatson;
        final double BLUTDICHTE = 1.055;

        double gkwMan = 2.447 - 0.09516 * alter + 0.1074 * hight + 0.3362 * gewicht;
        double gkwFrau = (0.1069 * hight) + (0.2466 * gewicht) - 2.097;
        double gkwFrauModify = 0.203 - 0.07 * alter + 0.1069 * hight + 0.2466 * gewicht;

        if (user.getGender().equals(Gender.M)) redFakWatson = BLUTDICHTE * gkwMan / (0.8 * gewicht);
        else redFakWatson = BLUTDICHTE * gkwFrau / (0.8 * gewicht);

        //Five ONLY FOR FRAU

        double redFakWatsonModify = BLUTDICHTE * gkwFrauModify / (0.8 * gewicht);

        if (user.getGender().equals(Gender.M)) mittelWert =
                (redFakWindmark + redFakSeidl + redFakUlrich + redFakWatson) / 4;
        else mittelWert = (redFakWindmark + redFakSeidl + redFakWatson + redFakWatsonModify) / 4;

		System.out.println("redFakWindmark " + redFakWindmark);
		System.out.println("redFakSeidl " + redFakSeidl);
		System.out.println("redFakUlrich " + redFakUlrich);
		System.out.println("redFakWatson " + redFakWatson);
		System.out.println("redFakWatsonModify " + redFakWatsonModify);
		System.out.println("mittelWert " + mittelWert);*//*



        return mittelWert;
    }

    public static double aufbauBAK(Person user, Alkohol drink, double reduktionsFaktor) {
        double promille;
        double gewicht = user.getGewicht();

        return promille = drink.findAlkoholInGramm() / (gewicht *
                findReduktionsFaktorArithmetischesMittel(user));

    }

    public static double abbauBak(Person pers, Alkohol getraenk) {
        double alkoholInGramm = getraenk.findAlkoholInGramm();
        double gewicht = pers.getGewicht();
        double alkoholkooficient = findReduktionsFaktorArithmetischesMittel(pers);
        //java.time
        //System.currentTimeMillis()
        double zeit;
        double promillenZumAbbauen = 0;

        zeit = (alkoholInGramm / (gewicht * alkoholkooficient) - promillenZumAbbauen) / 0.15;

        return zeit;
    }


	Метод готов. форматирование и тестирование требуется.	 *//*

    public double BAKformelWindmarkUno(Person pers, Alkohol getraenk) {

        double alkoholInGramm = getraenk.findAlkoholInGramm();
        double gewicht = pers.getGewicht();
        double alkoholkooficient;

		r der Reduktions- oder Verteilungsfaktor im Körper:
		Männer: 0,68–0,7
		Frauen/Jugendliche: 0,55–0,60
		Säuglinge/Kleinkinder: 0,75–0,80*//*


        if (pers.getGender().equals(Gender.W)) alkoholkooficient = 0.6;
        else alkoholkooficient = 0.7;
        double promilleWindmark = alkoholInGramm / (gewicht * alkoholkooficient);

        return promilleWindmark;
    }

    public static double BAKformelSeidlTwo(Person pers, Alkohol getraenk) {
        double reduktionsFaktorSeidlMan =
                0.31233 - 0.004821 * pers.getGewicht() + 0.004432 * pers.getHeight();
        double reduktionsFaktorSeidlFrau =
                0.31233 - 0.006446 * pers.getGewicht() + 0.004466 * pers.getHeight();
        double alkoholkooficient;
        if (pers.getGender().equals(Gender.M)) alkoholkooficient = reduktionsFaktorSeidlMan;
        else alkoholkooficient = reduktionsFaktorSeidlFrau;

        double alkoholInGramm = getraenk.findAlkoholInGramm();
        double gewicht = pers.getGewicht();
        double promilleSeidl = alkoholInGramm / (gewicht * alkoholkooficient);
        return promilleSeidl;
    }

    public double findRMSUlrich(Person pers, Alkohol getraenk) {
        //for man only
        double alkoholkooficient = 0.715 - 0.00462 * pers.getGewicht() + 0.0022 * pers.getHeight();
        double alkoholInGramm = getraenk.findAlkoholInGramm();
        double gewicht = pers.getGewicht();
        double promilleUlrich = alkoholInGramm / (gewicht * alkoholkooficient);
        return promilleUlrich;
    }

    public double BAKformelWatson(Person pers, Alkohol getraenk) {
        double hight = pers.getHeight();
        double gewicht = pers.getGewicht();
        double alter = pers.calculateAge();
        //Gesamtkörperwasser GKW [Liter]
        double gkwMan = 2.447 - 0.09516 * alter + 0.1074 * hight + 0.3362 * gewicht;
        double gkwFrau = -2.097 + 0.1069 * hight + 0.2466 * gewicht;
        double gkwFrauModify = 0.203 - 0.07 * alter + 0.1069 * hight * 0.2466 * gewicht;

        double r = 1.055 * gkwMan / (0.8 * gewicht);

        double alkoholInGramm = getraenk.findAlkoholInGramm();

        double promilleWatson = alkoholInGramm / (gewicht * r);
        return promilleWatson;
    }
}
*/
