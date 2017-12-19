package D1;

import java.util.Arrays;

/*
 * W pliku Main4.java umieść metodę o sygnaturze static int[] lessMore(int[][] arr).

    Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 2-wymiarowej obliczyć średnią arytmetyczną.
    Oblicz ile elementów jest mniejszych a ile większych od średniej.
    Metoda ma zwrócić tablicę składającą się z 2 elementów 1 - ilość elementów mniejszych od średniej, 2- ilość elementów większych.

 */
public class HomeWork04 {

	public static void main(String[] args) {
		
		int[][] table =  {{ 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4 }, { 5, 1, 6, 7 }};
		System.out.println("Średnia wynosi: " + String.valueOf(avg(table)));
		System.out.println("Zwracam tablicę: " + Arrays.toString(lessMore(table)));
	}
	
	static int[] lessMore(int[][] arr) {
		int avg = avg(arr);
		int[] lessMore = new int[2]; // [0] is less, [1] is more
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < avg) {
					lessMore[0] += 1;
				} else if(arr[i][j] > avg) {
					lessMore[1] += 1;
				}
			}
		}
		return lessMore;
		
	}
	
	static int avg(int[][] arr) {
		int sum = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			count += arr[i].length;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum / count;
	}
}
