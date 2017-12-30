package D4;

import java.util.Arrays;
import java.util.Scanner;

/*
 * W pliku Main4.java stwórz metodę o sygnaturze static void rowsColumns(), która:

    Wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych rows i columns.
    Stworzy tablicę o podanej liczbie rzędów i kolumn.
    Wypełni tablicę kolejnymi liczbami całkowitymi.
    Obliczy sumę wszystkich elementów oraz wyświetli na konsoli.
    Obliczy średnią wszystkich elementów oraz wyświetli na konsoli.
    Wywołaj metodę w metodzie main.

 */
public class DataInsert04 {

	public static void main(String[] args) {
		rowsColumns();
	}

	static void rowsColumns() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbę wierszy");
		int rows = chkInt(scan);
		System.out.println("Podaj liczbę kolumn");
		int cols = chkInt(scan);
		int[][] intArray = new int[rows][cols];
		fillArray(intArray);
		printArray(intArray);
		System.out.println("Suma wszystkich elementów w tablicy wynosi: " + arraySum(intArray));
		System.out.println("Średnia wszystkich elemntow w tablicy wynosi: " + arrayAvg(intArray));
	}

	static int chkInt(Scanner scan) {
		int number = 0;
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("Niepoprawne dane, wprowadź liczbę");
		}
		number = scan.nextInt();
		while (number < 0) {
			System.out.println("Nie można wprowadzić ujemnej liczby!");
			number = scan.nextInt();
		}
		return number;
	}

	static void fillArray(int[][] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = count;
				count++;
			}
		}
	}

	static int arraySum(int[][] array) {
		int value = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				value += array[i][j];
			}
		}
		return value;
	}

	static int arrayAvg(int[][] array) {
		int avg = 0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i].length;
		}
		avg = arraySum(array) / avg;
		return avg;
	}

	static void printArray(int[][] array) {
		System.out.println("Tablica: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
