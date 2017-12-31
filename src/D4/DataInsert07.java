package D4;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/*
 * W pliku Main7.java stwórz metodę o sygnaturze static void nettoBrutto(), która:

    Wczyta z konsoli typ wyliczenia dostępne wartości to: bn - zamiana brutto na netto nb - zamiana netto na brutto
    Wczyta z konsoli wartość do zamiany a następnie dokona zamiany wg wcześniej określonego typu. W przypadku otrzymania wartości innej niż możliwe bn, nb - program będzie pytał do skutku.
    Wywołaj metodę w metodzie main.

 */
public class DataInsert07 {

	public static void main(String[] args) {
		nettoBrutto();
	}
	
	static void nettoBrutto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadź typ wyliczenia: \n bn (zamiana brutto na netto) \n nb (zamiana netto na brutto");
		String nettoBrutto = getOperation(scan);
		System.out.println("Wprowadź wartośc do zmiany");
		double valueToChange = getInt(scan);
		if(nettoBrutto.equals("nb")) {
			nb(valueToChange);
		} else {
			bn(valueToChange);
		}
		scan.close();
	}
	
	static String getOperation(Scanner scan) {
		String operation = "";
		while(scan.hasNext()) {
			String temp = scan.next();
			if(temp.equals("bn") || temp.equals("nb")) {
				operation = temp;
				break;
			} else {
				System.out.println("Nieprawidłowe dane, wprowadź działanie bn lub nb!");
			}
		}
		return operation;
	}
	
	static double getInt(Scanner scan) {
		double temp = 0;
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.println("Nieprawidłowe dane, wprowadź wartość w cyfrach");
		}
		temp = scan.nextInt();
		while(temp < 0) {
			System.out.println("Wartość niemoże być ujemna! Wprowadź jeszcze raz");
			temp = scan.nextInt();
		}
		return temp;
	}
	
	static void nb(double valueToChange) {
		double result =  ((valueToChange / 78) * 100);
		String value = String.format("%.2f", result);
		System.out.println("Wartość brutto wynosi: " + value);
	}
	
	static void bn(double valueToChange) {
		double result = valueToChange * 0.78;
		String value = String.format("%.2f", result);
		System.out.println("Wartość netto wynosi: " + value);
	}
}
