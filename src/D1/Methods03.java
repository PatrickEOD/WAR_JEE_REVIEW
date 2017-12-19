package D1;

/*
 * W pliku Main3.java Napisz metodę convertToUsd, która przyjmuje parametr zlotys, czyli kwotę w złotówkach. 
 * Funkcja ma zwrócić podaną kwotę w dolarach amerykańskich. Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.
Zadanie 4


 */
public class Methods03 {
	
	public static void main(String[] args) {
		double quantity = 50; // zł
		double currency = 4.04; //USD
		System.out.println(convertToUsd(quantity, currency) + " USD");
		
	}
	
	static double convertToUsd(double quantity, double currency) {
		return quantity*currency;
	}
}
