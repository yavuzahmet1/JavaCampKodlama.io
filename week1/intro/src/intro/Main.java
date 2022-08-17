package intro;

public class Main {

	public static void main(String[] args) {

		// camelCase
		// Don't repeat yourself
		String internetSubesiButonu = "internet þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dolarDustuMu = false;

		System.out.println(internetSubesiButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		} else {
			System.out.println("Dolar kuru eþit");
		}

		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		String kredi5 = "MSB Kredi";
		String kredi6 = "MEB Kredi";

		String[] krediler = { "Hýzlý Kredi", "Mutlu Emekli Kredi", "Konut Kredi", "Çiftçi Kredi", "MSB Kredi",
				"MEB Kredi", "Kültür Bakanlýðý Kredisi" };

		System.out.println("********");

		for (String kredi : krediler) {

			System.out.println(kredi);
		}

		System.out.println("#########");

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
