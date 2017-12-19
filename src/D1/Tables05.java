package D1;

import java.util.Arrays;
import java.util.Random;

/*
 * W pliku Main5.java

    Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
    Posortuj rosnąco tablicę wykorzystując metody klasy Arrays.
    Wyświetl w konsoli posortowaną tablicę - również wykorzystaj metodę klasy Arrays.

 */
public class Tables05 {

	public static void main(String[] args) {
		System.out.println("Posortowana tablica: " + Arrays.toString(sortedTable(20)));
	}
	
	static int[] sortedTable(int tabLength) {
		int[] tab = new int[tabLength];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(101);
		}
		Arrays.sort(tab);
		return tab;
	}
}
