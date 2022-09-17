package mükemmelSayı;

public class Main {

	public static void main(String[] args) {
		//mükellem sayı bölenlerinin toplamı kendisi ise mükemmel sayıdır !!!
		int number = 6;
		int total = 0 ;
		
		for (int i = 1; i < number; i++) {
			if (number % i ==0 ) {
				total = total + i ;
			} 
			
			
		}
		if (total == number) {
			System.out.println("Mükemmle sayıdır !!!");
			
		} else {
			System.out.println("Mükemmel sayı değildir !!!");

		}
	 

	}

}
