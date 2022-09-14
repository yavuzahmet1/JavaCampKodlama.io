
public class Main {

	public static void main(String[] args) {

		System.out.println("Hello word...");
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade süresi";

		System.out.println(ortaMetin);

		int vade = (int) 1.2;
		System.out.println(vade);

		double dolarDun = 18.20;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = { "Kamu Kredisi", "Hýzlý Kredi", "Mutlu Emekli Kredisi" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
