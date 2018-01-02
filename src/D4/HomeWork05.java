package D4;

import java.util.Scanner;

/*
 * W pliku Main5.java stwórz metodę o sygnaturze static void printTriangle().

    Uzupełnij ciało metody tak, aby wczytała z konsoli wartość typu int.
    Wypisze na konsoli trójkąt zbudowany ze znaku x, w którym obie przyprostokątne będą równe wczytanej wartości Przykład dla wczytanej wartości równej 5.

x
x x
x x x
x x x x 
x x x x x

 */
public class HomeWork05 {

	public static void main(String[] args) {
		printTriangle();
	}

	static void printTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz wielkośc trujkąta");
		int size = chkInt(scan);
		scan.close();
		String star = "";
		for(int i = 1; i <= size; i++) {
			star += "*";
			System.out.println(star);
		}
	}

	static int chkInt(Scanner scan) {
		int result = 0;
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Niepoprawna wartość, wpisz liczbę");
		}
		result = scan.nextInt();
		while(result <= 0) {
			System.out.println("Wprowadź wartośc dodatnią");
			result = scan.nextInt();
		}
		return result;
	}
}
