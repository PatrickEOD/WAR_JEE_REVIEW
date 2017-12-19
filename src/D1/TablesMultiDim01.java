package D1;

/*
 * W pliku Main1.java znajduje się tablica o nazwie task1Array.

    Wypisz element znajdujący się w 3 kolumnie i 2 wierszu.
    Wypisz długość tablicy znajdującej się w drugim rzędzie.
    Wypisz element znajdujący się w czwartej kolumnie i 3 wierszu.

 */
public class TablesMultiDim01 {

	public static void main(String[] args) {

		int[][] task1Array = { 
				{ 2, 3, 4 },
				{ 12, 32, 12, 11 }, 
				{ 3, 2, 1, 4, 5 }, 
				{ 5, 1, 6, 7, 8 } 
				};
		System.out.println(String.valueOf(task1Array[1][2]));
		System.out.println(String.valueOf(task1Array[1].length));
		System.out.println(String.valueOf(task1Array[2][3]));
	}

}
