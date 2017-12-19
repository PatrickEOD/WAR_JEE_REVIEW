package D1;

import java.util.Arrays;
import java.util.Collections;

/*
 * W pliku Main5.java umieść metodę o sygnaturze static int[] append(int[] arr).

    Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy, 
    której rozmiar ma być 2-krotnie większy od tablicy podanej.
    Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
    Metoda ma zwrócić skopiowaną i uzupełnioną tablicę. Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};

 */
public class HomeWork05 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		System.out.println(Arrays.toString(append(arr)));
	}

	static int[] append(int[] arr) {
		int[] result = new int[arr.length * 2];
		int[] reverse = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			reverse[i] = arr[arr.length - i - 1];
		}
		for (int i = 0; i < result.length; i++) {
			if (i <= 2) {
				result[i] = arr[i];
			} else {
				result[i] = reverse[i - 3];
			}
		}

		return result;
	}
}
