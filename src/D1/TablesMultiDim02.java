package D1;

import java.util.Arrays;

/*
 * W pliku Main2.java znajduje się tablica o nazwie task2Array.

    W pętli wypisz długość tablic składających się na 2gi wymiar.
    W pętli wypisz wszystkie elementy tablicy 2 wymiarowej (musisz użyć do tego zagnieżdżonej pętli for).

 */
public class TablesMultiDim02 {

	public static void main(String[] args) {
		int[][] task2Array = { { 2, 3, 4 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
		System.out.println("Długośc tablic składających sie na 2gi wymiar:" + Arrays.toString(columnCount(task2Array)));
		tabElements(task2Array);

	}

	static int[] columnCount(int[][] tab) {
		int[] result = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			result[i] = tab[i].length;
		}
		return result;
	}
	
	static void tabElements(int[][] tab) {
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				System.out.print(String.valueOf((tab[i][j])) + ", ");
			}
		}
		
	}
}
