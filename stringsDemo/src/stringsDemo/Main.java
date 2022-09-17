package stringsDemo;

public class Main {

	public static void main(String[] args) {
		// char at string içersinde eleman bulmak için kullanılır
		// concat iki string i birleştirmek için kullanılır
		//startswhit komutu şunu ile öi başlıyor fonksiyonudur true veya false olarak cevap verir

		String mesaj = "  Bügün hava çok güzel    ";
		System.out.println(mesaj);

		//System.out.println("Eleman sayısı :" + mesaj.length());
		//System.out.println("5. eleman : " + mesaj.charAt(4));
		//System.out.println(mesaj.concat(" Yaşasınn !"));
		//System.out.println(mesaj);
		//System.out.println(mesaj.startsWith("B"));
		//System.out.println(mesaj.endsWith("l"));
		//char[] karakterler = new char[5];
		//mesaj.getChars(0, 5, karakterler, 0);
		//mesaj.getChars(0, 0, karakterler, 0);
		//System.out.println(karakterler);
		//System.out.println(mesaj.indexOf('a'));
		//System.out.println(mesaj.lastIndexOf('e'));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); //boşluk gördüğün yerlere - koy
		
		System.out.println(mesaj.substring(2 ));// mesajın içersindeki istediğin indexten parçalayarak al *** 
		//sonrada hangi aralıkta kesmeni istediğini söyleyebilyorsun.
		System.out.println(mesaj.substring(2,5 ));
		
		for (String kelime : mesaj.split(" ")) {//split içerideki şarta göre ayır!!
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase());//String mesajı hepsini küçük harfe çevirir''
		System.out.println(mesaj.toUpperCase());//String mesajı hepsini büyük harfe çevirir''
		
		System.out.println(mesaj.trim());//başındaki veya sonundaki boşluklerı keser ''
		
		

	}

}
