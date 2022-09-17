package sayıBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayılar = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int aranacak = 12;
		boolean varMı = false;
		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMı = true;
				break;
			}

		}
		if (varMı == true) {
			System.out.println("sayı bulunuyor!!");
		} else {
			System.out.println("sayı bulunmamaktadır!!");

		}

	}

}
