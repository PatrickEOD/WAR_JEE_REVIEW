package D1;

/*
 * W pliku Main5.java Napisz metodę calculateNet, która przyjmie argumenty:

    gross, czyli kwotę brutto ceny zakupu,
    vat, czyli wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 – 1.

Funkcja ma zwrócić wartość netto ceny. Jakie obliczenia musisz wykonać?
 */
public class Methods05 {
	
	public static void main(String[] args) {
		double brutto = 128.5;
		double vat = 0.28;
		System.out.println("Wartość netto z " + brutto + "zł wynosi: " + calculateNet(brutto, vat) + "zł.");
	}
	
	static double calculateNet(double gross, double vat) {
		return gross * (1 - vat);
	}
}
