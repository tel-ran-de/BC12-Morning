package lesson16;

/**
 * Created for BC12-Morning.
 * User: andron13
 * Date: 14.05.2020; Time: 09:44
 * https://github.com/tel-ran-de/BC12-Morning/blob/master/016-Java-Review-and-Tasks.md  задача про плитки
 */
public class Tile {
	static double speed = 1.0;
	static double oneHourPayment = 27;
	static double highTile = 30;
	static double widthTile = 10;

	static double roomPayment = 0;
	static double workHourPayment = 0;
	static double roomTileMaterialCOst = 0;
	static int tileCountMin = 0;
	static int tileCountMax = 0;

	public static void customerInfo(double h, double w, double tilePriceUnit) {
		h *= 100;
		w *= 100;
		countTile(h, w);
		brokenTile(h, w);

		System.out.println("Итоговая стоимость укладки плитки в комнате " + roomPayment);
		System.out.println("Стоимость рабочего времени" + workHourPayment);
		System.out.println("Стоимость материала" + roomTileMaterialCOst);
		System.out.println("Ориентировочное количество плиток от " + tileCountMin
				+ " и до " + tileCountMax);
	}

	private static int countTile(double h, double w) {
		int aLong = 0;  // вдоль  комнаты
		int aCross = 0;  // поперёк комнаты

		aCross = (int) (w / widthTile);
		aLong = (int) (h / highTile);
		System.out.println("промежуточное значение ЦЕЛЫХ плиток " + aCross * aLong);
		return aCross * aLong;
	}

	private static int brokenTile(double h, double w) {
		int aLong = 0;  // вдоль  комнаты
		int aCross = 0;  // поперёк комнаты

		aCross = (int) (Math.ceil(w / widthTile));
		aLong = (int) (Math.ceil(h / highTile));
		System.out.println("Округлённое значение всех плиток " + aCross * aLong);


		return aCross * aLong;
	}

}
