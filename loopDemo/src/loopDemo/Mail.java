package loopDemo;

public class Mail {

	public static void main(String[] args) {
		// int = i sayaç kısmı
		// i<10 i nin 10 dan küçük olduğu
		// i++ birer birer arttır
		// i+=2 tek sayıları yazdırmak
		// i = 2 | i+=2 çift sayıları yazdırmak
		// for
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i + "    Hesaplandı :   ");

		}
		System.out.println("::: for Döngüsü  bitti :::");
		// while

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;

		}
		System.out.println("::: while Döngüsü bitti");

		int j = 100;

		do {
			System.out.println(j);
			j += 1;
		} while (j < 10);
		System.out.println("::: do-while Döngüsü bitti");

	}

}
