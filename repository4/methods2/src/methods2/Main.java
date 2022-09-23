package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel";
		String yeniesaj = sehirVer();
		System.out.println(yeniesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,2,3,4);
		System.out.println(toplam);
		//Variable Arguments: methodun argümanlarında int... variable şeklinde yaparak o tipten bir dizi alınmasını sağlamaktır.
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1 , int sayi2){
		return sayi1 + sayi2 ;
	}
	
	public static int topla2 (int...sayılar ) {
		int toplam  = 0;
		for (int sayi : sayılar) {
			toplam+=sayi;
		}
		return toplam;
		
	}
	
	public static  String sehirVer() {
		return "Ankara";
	}
}

