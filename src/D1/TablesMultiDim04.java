package D1;

import java.util.Arrays;

/*
 * W pliku Main4.java znajduje się tablica o nazwie task4Array.

    Wypisz na konsoli ślad macierzy (sumę elementów na głównej przekątnej).

http://www.naukowiec.org/wiedza/matematyka/slad-macierzy_614.html
 */
public class TablesMultiDim04 {

	public static void main(String[] args) {

		int[][] task4Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4 }, { 5, 1, 6, 7 } };
		System.out.println("Ślas macierzy to: " + Arrays.toString(matrixTrace(task4Array)));
	}
	
	static int[] matrixTrace(int[][] array) {
		int[] tab = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				tab[i] = array[i][i];
			}
		}
		return tab;
	}
}
