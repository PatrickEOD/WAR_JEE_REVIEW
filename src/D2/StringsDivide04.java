package D2;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * W pliku Main4.java umieść metodę o sygnaturze static String[] onlyTwoElements(String str, char separator).

    Uzupełnij ciało metody tak aby, zwracała tablicę dokładnie 2 elementów, podzielonych wg pierwszego napotkanego znaku podziału. 
    Przykład" dla napisu Java-zadania-podzial-napisow oraz separatora - otrzymamy 1 element tablicy Java oraz 2 element zadania-podzial-napisow.

 */
public class StringsDivide04 {

	public static void main(String[] args) {
		String str = "Java-zadania-podzial-napisow";
		System.out.println("Podział: " + Arrays.toString(onlyTwoElements1(str, '-')));
	}
	
	static String[] onlyTwoElements1(String str, char separator) {
		String[] elements = {"", ""};
		StringTokenizer tokens = new StringTokenizer(str, String.valueOf(separator));
		int i = 0;
		while(tokens.hasMoreTokens()) {
			if(i < 1) {
				elements[0] = tokens.nextToken();
			}
			if(i >= 1) {
				elements[1] += tokens.nextToken("");
			}
			i++;
		}
		return elements;
	}
}
