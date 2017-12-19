package D1;

import java.util.Arrays;

/*
 * W pliku Main3.java

    Stwórz 10 elementową tablicę wypełnioną pojedynczą wartością 2. Tablica powinna wyglądać następująco:

    [2. 2. 2. 2. 2. 2 .2 . 2. 2. 2]

    Zadanie wykonaj bez użycia pętli for.

 */
public class Tables03 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(createTable(5)));
	}
	
	static int[] createTable(int fillValue) {
		int[] tab = new int[10];
		Arrays.fill(tab, fillValue);
		return tab;
	}
	
}
