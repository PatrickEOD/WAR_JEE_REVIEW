package D1;

import java.util.Arrays;

/*
 * W pliku Main1.java

    Stwórz tablicę z elementami od 0 do 50 np. z kolejnymi liczbami całkowitymi, zmienną z tablicą nazwij mainTab
    Następnie wypisz na konsoli po kolei elementy tej tablicy w wierszach po 10.
    Liczby jednocyfrowe przedstaw formie z dodatkowym zerem na początku np.: 03.

00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
40, 41, 42, 43, 44, 45, 46, 47, 48, 49,

 */
public class Tables01 {

	public static void main(String[] args) {
		printTab(createTab(50));
	}
	
	static int[] createTab(int mainTab) {
		int[] tab = new int[mainTab];
		
		for(int i = 0; i < mainTab; i++) {
			tab[i] = i;
		}
		return tab;
	}
	
	static void printTab(int[] tab) {
		String[] number = new String[tab.length];
		
		for(int i = 0; i < tab.length; i++) {
			number[i] = String.valueOf(tab[i]);
			if(i <= 9) {
				number[i] = "0" + String.valueOf(tab[i]);
			}
			if(i % 10 == 0 && i > 0) {
				number[i] = "\n" + number[i] ;
			}
		}
		System.out.println(Arrays.toString(number));
	}
}
