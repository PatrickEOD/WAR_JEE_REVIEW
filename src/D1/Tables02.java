package D1;

import java.util.Arrays;
import java.util.Random;

/*
 * W pliku Main2.java

    Stwórz tablicę z 20 losowymi liczbami z zakresu 0-100, zmienną z tablicą nazwij randNumbers
    Użyj do tego pętli for - do otrzymania losowej wartości użyj sposobu opisanego w snippetach.
    Wypisz w konsoli minimalną wartość z tablicy.

 */
public class Tables02 {

	public static void main(String[] args) {
		int n = 20;
		int[] tab = createTab(n);
		System.out.println("Tablica: " + Arrays.toString(tab));
		System.out.println("Minimalna wartośc wynisi: " + tabMinimum(tab));
	}
	
	static int[] createTab(int tabLength) {
		int[] tab = new int[tabLength];
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(101);
		}
		return tab;
	}
	
	static int tabMinimum(int[] tab) {
		int minimum = tab[0];
		
		for(int i = 1; i < tab.length; i++) {
			if(minimum > tab[i]) {
				minimum = tab[i];
			}
		}
		return minimum;
	}
}
