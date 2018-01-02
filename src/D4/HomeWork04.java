package D4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * W pliku Main4.java stwórz metodę o sygnaturze static int[] sortedArray().

    Uzupełnij ciało metody tak, aby wczytała z konsoli ile liczb należy wylosować.
    Stworzy tablicę oraz umieść w niej losowe wartości z zakresu [0,100].
    Posortuje elementy tablicy a następnie ją zwróci.

 */
public class HomeWork04 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedArray()));
	}
	
	static int[] sortedArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz ile liczb trzeba wylosować");
		int size = chkInt(scan);
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(101);
		}
		scan.close();
		Arrays.sort(array);
		return array;
		
	}
	
	static int chkInt(Scanner scan) {
		int result = 0;
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.println("Niepoprawne dane, wpisz liczbę");
		}
		result = scan.nextInt();
		while(result <= 0) {
			System.out.println("Wpisz liczbe dodatnią");
			result = scan.nextInt();
		}
		return result;
	}
}
