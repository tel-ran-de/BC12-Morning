 //01logic-06
    public static int teaParty(int tea, int candy) {
        //We are having a party with amounts of tea and candy.
        // Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
        // A party is good (1) if both tea and candy are at least 5.
        // However, if either tea or candy is at least double the amount of the other one, the party is great (2).
        // However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

        if (tea >= 5 && candy >= tea * 2 | tea >= candy * 2 && candy >= 5) return 2;
        else if (tea >= 5 && candy >= 5) return 1;
        else return 0;
    }
    
    


//02_EL_01_01 : вечеринка белок успешна, когда количество сигар составляет от 40 до 60 включительно.
	//Если это  выходные, в этом случае не существует верхней границы количества сигар.
	// Вернуть true, если вечеринка с заданными значениями успешна, или false в противном случае.
	private static boolean cigarParty(int cigars, boolean weekend) {
		if ((weekend) && cigars > 60) {
			return true;
		} else if ((!weekend) && cigars >= 40 & cigars < 60) {
			return true;
		} else
			return false;
	}
