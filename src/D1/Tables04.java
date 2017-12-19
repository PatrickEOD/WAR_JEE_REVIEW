package D1;

import java.util.Arrays;
import java.util.Random;

/*
 * W pliku Main4.java

    Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
    Stwórz zmienną tablicową reverse i umieść w niej elementy tablicy numbers w odwrotnej kolejności.
    Wypisz na konsoli elementy z odwróconej tablicy.

Dla tablicy o elementach:

3, 5, 7, 2, 1

Wypisze:

1, 2, 7, 5, 3

 */
public class Tables04 {

	public static void main(String[] args) {
		int tabLength = 5;
		int[] tab = createTable(tabLength);
		System.out.println("Tablica: " + Arrays.toString(tab));
		System.out.println("Tablica odwrócona: " + Arrays.toString(reverseTab(tab)));
	}
	
	static int[] createTable(int tabLength) {
		int[] tab = new int[tabLength];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(10); // liczby z zakresu od 0 do 9
		}
		return tab;
	}
	
	static int[] reverseTab(int[] tab) {
		int[] reverse = new int[tab.length];
		
		for(int i = tab.length - 1; i >= 0; i--) {
			reverse[reverse.length - i - 1] = tab[i];
		}
		return reverse;
	}
}
