package reCapDemmo2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = { 1.2, 1.3, 4.3, 5.6, 12.8 };
		double total = 0;
		double max = myList[0];
		double min = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			if(min> number) {
				min = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam eşittir 	" + total);
		System.out.println("En büyük :" + max);
		System.out.println("En küçük :" + min);

	}

}
