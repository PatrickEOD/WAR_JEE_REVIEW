package D4;

import java.util.Scanner;

/*
 * W pliku Main2.java stwórz metodę o sygnaturze static void operations().

    Uzupełnij ciało metody tak, by wczytała 2 liczby a następnie wyświetliła na konsoli wynik dodawania, odejmowania, mnożenia i dzielenia.
    Wywołaj metodę w metodzie main.

 */

public class DataInsert02 {

	public static void main(String[] args) {
		operations();
	}
	
	static void operations() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj pierwsza liczbę");
		int number1 = isInteger(scan);
		System.out.println("Podaj druga liczbę");
		int number2 = isInteger(scan);
		int sum = number1 + number2;
		System.out.println("Wynik dodawania: " + number1 + " + " + number2 + " wynosi: " + sum);
		int subtraction = number1 - number2;
		System.out.println("Wynik odejmowania: " + number1 + " - " + number2 + " wynosi: " + subtraction);
		int multiplication = number1 * number2;
		System.out.println("Wynik mnożenia: " + number1 + " * " + number2 + " wynosi: " + multiplication);
		double division = (double) number1 / number2;
		System.out.println("Wynik dzielenia: " + number1 + " / " + number2 + " wynosi: " + division);
	}
	
	static int isInteger(Scanner scan) {
		int temp = 0;
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.println("Nieprawidłowy format danych, wprowadź liczbę");
		}
		temp = scan.nextInt();
		while(temp == 0) {
			System.out.println("Nie dzieli się przez zero!");
			temp = scan.nextInt();
		}
		return temp;
	}
	
}
