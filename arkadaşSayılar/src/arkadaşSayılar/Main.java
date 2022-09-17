package arkadaşSayılar;

public class Main {

	public static void main(String[] args) {
		// arkadaş sayı 220-284 ||| iki sayıdan birinin pozitif blenlerinin toplamı
		// diğerini //
		// diğerinin pozitif bölelerinin toplamı diğerini veriyorsa bunlar arkadaş
		// sayılardır!!!

		int sayı1 = 220;
		int sayı2 = 280;

		int total1 = 0;
		int total2 = 0;
		for (int i = 1; i < sayı1; i++) {
			if (sayı1 % i == 0) {
				total1 = total1 + i;

			}

		}
		for (int i = 1; i < sayı2; i++) {
			if (sayı2 % i == 0) {
				total2 = total2 + i;
			}
		}
		if (sayı1 == total2 && sayı2 == total1) {
			System.out.println("BU iki sayı arkadaş sayıdır !!!");

		} else {
			System.out.println("Bu iki sayı arkadaş değildir !!");
		}

	}

}
