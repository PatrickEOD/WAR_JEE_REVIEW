package E1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * W pliku Main4.java umieść metodę o sygnaturze static int[] returnTab().

    Uzupełnij ciało metody tak by pobierała z konsoli parametr n, tworzyła tablicę o ilości elementów n.
    Elementy tablicy mają być kolejnymi liczbami naturalnymi zaczynając od 1.

 */
public class Exam04 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(returnTab()));
	}
	
	static int[] returnTab() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz ilość elementów.");
		int n = chkInt(scan);
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}
	
	static int chkInt(Scanner scan) {
		int result = 0;
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.println("Wprowadź liczbę.");
		}
		result = scan.nextInt();
		while(result <= 0) {
			System.out.println("Wprowadź liczbę dodatnią!");
			result = scan.nextInt();
		}
		return result;
	}
}
