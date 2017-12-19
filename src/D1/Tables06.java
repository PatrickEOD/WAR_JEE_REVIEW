package D1;

import java.util.Arrays;
import java.util.Random;

/*
 * W pliku Main6.java

    Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij numbers.
    Stwórz drugą tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij secondNumbers.
    Stwórz trzecią tablicę zawierającą sumę wszystkich kolejnych elementów.

Dla przykładowych tablic:

int[] numbers = {2, 3};
int[] secondNumners = {3, 4};

wynikiem będzie tablica o elementach 5 i 7 .
 */
public class Tables06 {

	public static void main(String[] args) {
		int tabLen = 15;
		int[] tab1 = createTab(tabLen);
		int[] tab2 = createTab(tabLen);
		System.out.println("Tablica 1: " + Arrays.toString(tab1));
		System.out.println("Tablica 2: " + Arrays.toString(tab2));
		System.out.println("Nowa tablica: " + Arrays.toString(sumTable(tab1, tab2)));
	}
	
	static int[] createTab(int tabLength) {
		int[] tab = new int[tabLength];
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(tabLength);
		}
		return tab;
	}
	
	static int[] sumTable(int[] tab1, int[]tab2) {
		int[] tab = new int[tab1.length];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = tab1[i] + tab2[i];
		}
		return tab;
	}
}
