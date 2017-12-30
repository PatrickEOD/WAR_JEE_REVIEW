package D4;

import java.util.Scanner;

/*
 * W pliku Main3.java stwórz metodę o sygnaturze static void getData().

    Uzupełnij ciało metody tak, by wczytywała liczby z konsoli, sumowała ich wartość oraz ilość i wyświetlała na konsoli do momentu wprowadzania 0.
    Wywołaj metodę w metodzie main.

 */
public class DataInsert03 {

	public static void main(String[] args) {
		getData();
	}

	static void getData() {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int number = 0;
		do {
			System.out.println("Wprowadź liczbę");
			number = chkInt(scan);
			sum += number;
			count++;
			System.out.println("Suma: " + sum + "     Operacja: " + count);
		} while (number != 0);
		System.out.println("Zakończono pracę programu");
		scan.close();
	}

	static int chkInt(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Nieprawidłowe dane, wprowadź liczbę");
		}
		int number = scan.nextInt();
		return number;
	}
}
