package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number = 31;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Asal sayı değildir !!!");
			return;
		}
		if (number < 2) {
			System.out.println("Geçersiz sayı !!!");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;

			}

		}
		if (isPrime) {
			System.out.println("sayı asaldır");

		} else {
			System.out.println("Sayı asal değildir");
		}

	}

}
