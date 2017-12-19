package D1;

/*
 * W pliku Main3.java znajduje się tablica o nazwie task3Array.

    Wypisz na konsoli sumę wszystkich elementów tablicy.

 */
public class TablesMultiDim03 {

	public static void main(String[] args) {
		
		int[][] task3Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
		
		System.out.println("Suma wszystkich elementów tablicy: " + String.valueOf(sum(task3Array)));
	}
	
	static int sum(int[][] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}
}
