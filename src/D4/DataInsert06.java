package D4;

import java.util.Scanner;

/*
 * W pliku Main6.java stwórz metodę o sygnaturze static void equation(), która:

    Poprosi o podanie liczb całkowitych a, b, c
    Obliczy pierwiastki równania kwadratowego, a następnie je wyświetli.
    Wywołaj metodę w metodzie main.

 */
public class DataInsert06 {

	public static void main(String[] args) {
		equation();
	}

	static void equation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadź liczbę a");
		double a = chkInt(scan);
		System.out.println("Wprowadź liczbę b");
		double b = chkInt(scan);
		System.out.println("Wprowadź liczbę c");
		double c = chkInt(scan);
		double x1 = 0;
		double x2 = 0;
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Równanie kwadratowe ma postać: " + a + "x^2 + " + b + "x + " + c);
		System.out.println("Delta wynosi:" + delta);
		if (delta == 0) {
			x1 = x2 = (-b) / (2 * a);
			System.out.println("Pierwiastki równania kwadratowego wynoszą: \n x1: " + x1 + "\n x2: " + x2);
		} else if (delta < 0) {
			System.out.println("Rozwiązanie pierwiastków w dziedzinie zespolonej");
		} else {
			x1 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			x2 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			System.out.println("Pierwiastki równania kwadratowego wynoszą: \n x1: " + x1 + "\n x2: " + x2);
		}
	}

	static int chkInt(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Niepoprawne dane, wprowadź liczbę");
		}
		int number = scan.nextInt();
		return number;
	}
}
