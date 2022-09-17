package multiDimesnionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// MultiDimensilonal yapı olarak ta kullanılabilr istersen 3 lü yapı isterwsen 4
		// lü yapı
		// ***************örnek yapı**********************
		String[][] arabalar = new String[5][5];
		arabalar[0][0] = "toyota coralla";
		arabalar[0][1] = "toyota crv";
		arabalar[0][2] = "toyota navara";
		arabalar[0][3] = "toyota nare";
		arabalar[0][4] = "toyota hdr";
		arabalar[1][0] = "tofaş kartal";
		arabalar[1][1] = "tofaş serçe";
		arabalar[1][2] = "tofaş doğal sl";
		arabalar[1][3] = "tofaş doğan slx";
		arabalar[1][4] = "tofaş hacı";
		arabalar[2][0] = "honda quruse";
		arabalar[2][1] = "honda kelpe";
		arabalar[2][2] = "honda civic";
		arabalar[2][3] = "honda hrv";
		arabalar[2][4] = "honda city";
		arabalar[3][0] = "seat leon ";
		arabalar[3][1] = "seat kera";
		arabalar[3][2] = "seat 1";
		arabalar[3][3] = "seat 2";
		arabalar[3][4] = "seat 3";
		arabalar[4][0] = "range rover 1";
		arabalar[4][1] = "range rover 2";
		arabalar[4][2] = "range rover 3";
		arabalar[4][3] = "range rover 4  ";
		arabalar[4][4] = "range rover 5";
		for (int e = 0; e <= 4; e++) {
			System.out.println("-----------------------");
			for (int r = 0; r < arabalar.length; r++) {
				System.out.println(arabalar[e][r]);

			}

		}

		System.out.println("*****************************************************************");

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Sakarya ";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {
			System.out.println("---------------------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}

		}

	}

}
