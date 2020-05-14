package lesson16;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 14.05.2020; Time: 09:44
 * https://github.com/tel-ran-de/BC12-Morning/blob/master/016-Java-Review-and-Tasks.md  задача про плитки
 */
public class Tile {
	static double speed = 1.5;
	static double oneHourPayment = 27;
	static double highTile = 30;
	static double widthTile = 10;

	static double roomPayment = 0;
	static double workHourPayment = 0;
	static double roomTileMaterialCOst = 0;
	static int tileCountMinInt = 0;
	static int tileCountMinAll = 0;
	static int tileCountMinBroken = 0;
	static int tileCountMaxInt = 0;
	static int tileCountMaxAll = 0;
	static int tileCountMaxBroken = 0;


	public static void customerInfo(double h, double w, double tilePriceUnit) {
		h *= 100;
		w *= 100;
		//вдоль
		tileCountMinInt = countTile(h, w);
		tileCountMinBroken = countBrokenTile(h, w);
		tileCountMinAll = tileCountMinInt + tileCountMinBroken;
		//поперёк
		tileCountMaxInt = countTile(w, h);
		tileCountMaxBroken = countBrokenTile(w, h);
		tileCountMaxAll = tileCountMaxInt + tileCountMaxBroken;
		roomTileMaterialCOst = findMaterialCost(h, w, tilePriceUnit);
		workHourPayment = oneHourPayment * h * w / (10000 * speed);
		roomPayment = (workHourPayment + roomTileMaterialCOst) * 1.19;

		System.out.println("Итоговая стоимость укладки плитки в комнате + 19% MwSt" + roomPayment);
		System.out.println("Стоимость рабочего времени " + workHourPayment);
		System.out.println("Стоимость материала по максимуму " + roomTileMaterialCOst + "€");
		System.out.println(
				"При раскладке вдоль понадобится целых плиток: " + tileCountMinAll
						+ " из них поломанных: " + tileCountMinBroken
						+ " из них целых: " + tileCountMinInt);
		System.out.println(
				"При раскладке ПОПЕРЁК понадобится целых плиток: " + tileCountMaxAll
						+ " из них поломанных: " + tileCountMaxBroken
						+ " из них целых: " + tileCountMaxInt);
	}

	private static int countTile(double h, double w) {
		int aLong = 0;  // вдоль  комнаты
		int aCross = 0;  // поперёк комнаты

		aCross = (int) (w / widthTile);
		aLong = (int) (h / highTile);
		return aCross * aLong;
	}

	private static int countBrokenTile(double h, double w) {
		int aLong = 0;  // вдоль  комнаты
		int aCross = 0;  // поперёк комнаты

		aCross = (int) (Math.ceil(w / widthTile));
		aLong = (int) (Math.ceil(h / highTile));
		return aCross * aLong - countTile(h, w);
	}

	private static double findMaterialCost(double h, double w, double money) {
		int a, b;
		a = (countTile(h, w) + countBrokenTile(h, w));
		b = (countTile(w, h) + countBrokenTile(w, h));
		if (a > b) {
			return a * money;
		} else {
			return b * money;
		}
	}
}
