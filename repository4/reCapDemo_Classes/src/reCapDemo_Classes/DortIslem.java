package reCapDemo_Classes;

public class DortIslem {
	public int Topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;

		}
		return toplam;

	}

	public int Cıkar(int... sayilar) {
		int cıkar = 0;
		for (int sayi : sayilar) {
			cıkar -= sayi;
		}
		return cıkar;
	}

	public int Carp(int... sayilar) {
		int carp = 0;
		for (int sayi : sayilar) {
			carp *= sayi;
		}
		return carp;
	}

	public int Bol(int... sayilar) {
		int bol = 0;
		for (int sayi : sayilar) {
			bol /= sayi;
		}
		return bol;
	}
}
